package Datafiles.Vinyl.States;

import Datafiles.Vinyl.Vinyl;

public class BorrowedState implements VinylState
{
    public final static String state = "Borrowed";

    @Override
    public void available(Vinyl vinyl)
    {
        vinyl.setCurrentState(new AvailableState());
    }

    @Override
    public void reserved(Vinyl vinyl) {
        System.out.println("Vinyl Borrowed, cannot go to reserved");
    }

    @Override
    public void borrowed(Vinyl vinyl) {
        System.out.println("Vinyl Already borrowed, cannot go to borrowed");
    }

    @Override
    public void borrowedAndReserved(Vinyl vinyl)
    {
        vinyl.setCurrentState(new BorrowedAndReservedState());
    }

    @Override
    public String getState() { return state; }

    @Override
    public String toString() {
        return state;
    }

}

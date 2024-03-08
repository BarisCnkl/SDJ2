package Datafiles.Vinyl.States;

import Datafiles.Vinyl.Vinyl;

public class AvailableState implements VinylState
{
    public final static String state = "Available";

    @Override
    public void available(Vinyl vinyl)
    {
        System.out.println("Vinyl already available, cannot go to available");
    }

    @Override
    public void reserved(Vinyl vinyl)
    {
        vinyl.setCurrentState(new ReservedState());
    }

    @Override
    public void borrowed(Vinyl vinyl)
    {
        vinyl.setCurrentState(new BorrowedState());
    }

    @Override
    public void borrowedAndReserved(Vinyl vinyl)
    {
        System.out.println("Vinyl available, cannot go to borrowed and reserved");
    }

    @Override
    public String getState() { return state; }

    @Override
    public String toString() {
        return state;
    }

}


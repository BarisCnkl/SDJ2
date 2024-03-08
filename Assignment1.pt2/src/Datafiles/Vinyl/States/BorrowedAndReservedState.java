package Datafiles.Vinyl.States;

import Datafiles.Vinyl.Vinyl;

public class BorrowedAndReservedState implements VinylState
{
    public final static String state = "Borrowed and Reserved";

    @Override
    public void available(Vinyl vinyl)
    {
        System.out.println("Vinyl Borrowed and Reserved, cannot go to available");
    }

    @Override
    public void reserved(Vinyl vinyl)
    {
        vinyl.setCurrentState(new ReservedState());
    }

    @Override
    public void borrowed(Vinyl vinyl)
    {
        System.out.println("Vinyl already borrowed and reserved, cannot go to borrowed");
    }

    @Override
    public void borrowedAndReserved(Vinyl vinyl)
    {
        System.out.println("Vinyl already at borrowed and reserved, cannot go to borrowed and reserved");
    }

    @Override
    public String getState() { return state; }

    @Override
    public String toString() {
        return state;
    }

}

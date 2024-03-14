package Datafiles;

import Datafiles.Vinyl.States.AvailableState;
import Datafiles.Vinyl.States.BorrowedAndReservedState;
import Datafiles.Vinyl.States.BorrowedState;
import Datafiles.Vinyl.States.ReservedState;
import Datafiles.Vinyl.Vinyl;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    List<Vinyl> vinylList;

    public Library()

    {
        this.vinylList = new ArrayList<>();
    }
    public void addVinyl(Vinyl vinyl)
    {
        vinylList.add(vinyl);
    }

    public void removeVinyl(Vinyl vinyl)
    {
        vinylList.remove(vinyl);
    }

    public List<Vinyl> getVinylList() {
        return vinylList;
    }

    public void BorrowVinyl(Vinyl vinyl, User user)
    {
        Vinyl vinyl1 = vinylList.get(vinylList.indexOf(vinyl));
        if (vinyl1.getCurrentState().getState().equals(AvailableState.state))
        {
            vinyl1.getBorrowed();
            vinyl1.setBorrowedBy(user);
        }
        else if (vinyl1.getCurrentState().getState().equals(ReservedState.state) && vinyl1.getReservedBy().equals(user))
        {
            vinyl1.getBorrowed();
            vinyl1.setBorrowedBy(user);
            vinyl1.setReservedBy(null);
        }
    }

    public void ReserveVinyl(Vinyl vinyl, User user)
    {
        Vinyl vinyl1 = vinylList.get(vinylList.indexOf(vinyl));
        if (vinyl1.getCurrentState().getState().equals(AvailableState.state))
        {
            vinyl1.getReserved();
            vinyl1.setReservedBy(user);
        }
        else if (vinyl1.getCurrentState().getState().equals(BorrowedState.state))
        {
            vinyl1.getBorrowedAndReserved();
            vinyl1.setReservedBy(user);
        }
    }

    public void returnVinyl(Vinyl vinyl, User user)
    {
        Vinyl vinyl1 = vinylList.get(vinylList.indexOf(vinyl));
        if (vinyl1.getCurrentState().getState().equals(BorrowedState.state) && vinyl1.getBorrowedBy().equals(user))
        {
            vinyl1.getAvailable();
            vinyl1.setBorrowedBy(null);
        }
        else if (vinyl1.getCurrentState().getState().equals(BorrowedAndReservedState.state))
        {
            vinyl1.getReserved();
            vinyl1.setBorrowedBy(null);
        }
    }

}

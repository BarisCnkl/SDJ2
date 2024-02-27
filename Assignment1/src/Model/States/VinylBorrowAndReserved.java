package Model.States;

import Model.States.VinylReserved;
import Model.States.VinylState;
import Model.Vinyl;

public class VinylBorrowAndReserved implements VinylState
{
  public static final String state = "Borrow and Reserved";
  @Override public void vinylAvailable(Vinyl vinyl)
  {

  }

  @Override public void vinylBorrow(Vinyl vinyl)
  {

  }

  @Override public void vinylReserved(Vinyl vinyl)
  {
    vinyl.setVinylState(new VinylReserved());
  }

  @Override public void vinylBorrowAndReserved(Vinyl vinyl)
  {

  }

  @Override public String getState()
  {
    return null;
  }
}

package Model.States;

import Model.States.VinylBorrow;
import Model.States.VinylReserved;
import Model.States.VinylState;
import Model.Vinyl;

public class VinylAvailable implements VinylState
{
  public static final String state = "Available";
  @Override public void vinylAvailable(Vinyl vinyl)
  {

  }

  @Override public void vinylBorrow(Vinyl vinyl)
  {
      vinyl.setVinylState(new VinylBorrow());
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
    return state;
  }
}

package Model.States;

import Model.Vinyl;

public class VinylReserved implements VinylState
{
  public static final String state = "Reserved";

  @Override public void vinylAvailable(Vinyl vinyl)
  {

  }

  @Override public void vinylBorrow(Vinyl vinyl)
  {
    vinyl.setVinylState(new VinylBorrow());
  }

  @Override public void vinylReserved(Vinyl vinyl)
  {

  }

  @Override public void vinylBorrowAndReserved(Vinyl vinyl)
  {

  }

  @Override public String getState()
  {
    return state;
  }
}

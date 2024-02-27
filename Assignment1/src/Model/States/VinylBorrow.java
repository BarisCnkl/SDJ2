package Model.States;

import Model.Vinyl;

public class VinylBorrow implements VinylState
{
  public static final String state = "Borrow";
  @Override public void vinylAvailable(Vinyl vinyl)
  {
      vinyl.setVinylState(new VinylAvailable());
  }

  @Override public void vinylBorrow(Vinyl vinyl)
  {

  }

  @Override public void vinylReserved(Vinyl vinyl)
  {

  }

  @Override public void vinylBorrowAndReserved(Vinyl vinyl)
  {
    vinyl.setVinylState(new VinylBorrowAndReserved());
  }

  @Override public String getState()
  {
    return state;
  }
}

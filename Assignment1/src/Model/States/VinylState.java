package Model.States;

import Model.Vinyl;

public interface VinylState
{
  void vinylAvailable(Vinyl vinyl);
  void vinylBorrow(Vinyl vinyl);
  void vinylReserved(Vinyl vinyl);
  void vinylBorrowAndReserved(Vinyl vinyl);
  String getState();
}

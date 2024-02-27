package Model;

import Model.States.VinylAvailable;
import Model.States.VinylBorrow;
import Model.States.VinylBorrowAndReserved;
import Model.States.VinylState;

public class Vinyl
{
  private String titel, artist, date;
  private VinylState vinylState;

  public Vinyl(String titel, String artist, String date)
  {
    this.titel = titel;
    this.artist = artist;
    this.date = date;
    vinylState = new VinylAvailable();
  }

  public String getTitel()
  {
    return titel;
  }

  public String getArtist()
  {
    return artist;
  }

  public String getDate()
  {
    return date;
  }

  public VinylState getVinylState()
  {
    return vinylState;
  }

  public void setVinylState(VinylState vinylState)
  {
    this.vinylState = vinylState;
  }
  public void vinylBorrow()
  {
    if (vinylState.getState().equals(VinylAvailable.state))
    {
      vinylState.vinylBorrow(this);
    }
  }
  public void returnVinyl()
  {
    if (vinylState.getState().equals(VinylBorrow.state))
    {
      vinylState.vinylAvailable(this);
    }
    else if(vinylState.getState().equals(VinylBorrowAndReserved.state))
    {
      vinylState.vinylReserved(this);
    }
  }
  public void vinylReserve()
  {
    if (vinylState.getState().equals(VinylAvailable.state))
    {
      vinylState.vinylReserved(this);
    }
    else if(vinylState.getState().equals(VinylBorrow.state))
    {
      vinylState.vinylBorrowAndReserved(this);
    }
  }
}

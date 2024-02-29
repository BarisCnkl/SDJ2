package Model;

import Model.States.*;

public class Vinyl
{
  private String titel, artist, date;
  private VinylState vinylState;
  private User user;

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
  public void vinylBorrow(User user)
  {
    if (vinylState.getState().equals(VinylAvailable.state))
    {
      vinylState.vinylBorrow(this);
    }
    else if(vinylState.getState().equals(VinylReserved.state)&& user.getId() == this.user.getId())
    {
      vinylState.vinylBorrow(this);
      removeUser();
    }
  }
  public void returnVinyl()
  {
    if (vinylState.getState().equals(VinylBorrow.state))
    {
      vinylState.vinylAvailable(this);
      removeUser();
    }
    else if(vinylState.getState().equals(VinylBorrowAndReserved.state))
    {
      vinylState.vinylReserved(this);
    }

  }
  public void vinylReserve(User user)
  {
    if (vinylState.getState().equals(VinylAvailable.state))
    {
      vinylState.vinylReserved(this);
      addUser(user);
    }
    else if(vinylState.getState().equals(VinylBorrow.state))
    {
      vinylState.vinylBorrowAndReserved(this);
      addUser(user);
    }
  }
  public void addUser(User user)
  {
    this.user=user;
  }
  public void removeUser()
  {
    user = null;
  }
}

package main;

import Datafiles.Library;
import Datafiles.User;
import Datafiles.Vinyl.Vinyl;
import Model.VinylListModel;

public class Simulation implements Runnable
{
  private VinylListModel vinylListModel;
  private User user;

  public Simulation(VinylListModel vinylListModel)
  {
    this.vinylListModel = vinylListModel;
  }

  @Override public void run()
  {
    user = new User((int)(Math.random() * 1000-1+1) + 1);
    try
    {
      Thread.sleep(1000);
    }
    catch (InterruptedException | IndexOutOfBoundsException e)
    {
      throw new RuntimeException(e) ;
    }
    while (true)
    {
      try
      {
        vinylListModel.borrowVinyl(vinylListModel.getVinylList().get((int)(Math.random()*vinylListModel.getVinylList().size()-0)+0), user);
        Thread.sleep(1000);
      }
      catch (InterruptedException | IndexOutOfBoundsException e)
      {
        throw new RuntimeException(e) ;
      }
      try
      {
        vinylListModel.reserveVinyl(vinylListModel.getVinylList().get((int)(Math.random()*vinylListModel.getVinylList().size()-0)+0), user);
        Thread.sleep(1000);
      }
      catch (InterruptedException | IndexOutOfBoundsException e)
      {
        throw new RuntimeException(e) ;
      }
      try
      {
        vinylListModel.returnVinyl(vinylListModel.getVinylList().get((int)(Math.random()*vinylListModel.getVinylList().size()-0)+0), user);
        Thread.sleep(1000);
      }
      catch (InterruptedException | IndexOutOfBoundsException e)
      {
        throw new RuntimeException(e) ;
      }
    }
  }
}

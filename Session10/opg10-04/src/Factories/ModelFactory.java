package Factories;

import Model.Model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ModelFactory
{
  private static ModelFactory instance = new ModelFactory();
  private static final Lock lock = new ReentrantLock();
  private static Model model;

  /*private Model getModel()
  {
    getInstance();
  }
  public static ModelFactory getInstance()
  {
    public Model getModel()
    {
      if(model == null)
      {

      }
      return model;
    }
  }*/
}

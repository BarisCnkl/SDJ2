package Server;

import Server.MyRemoteInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteInterfaceImpl extends UnicastRemoteObject implements
    MyRemoteInterface
{
  public MyRemoteInterfaceImpl() throws RemoteException {
    super();
  }

  @Override
  public String sayHello() throws RemoteException {
    return "Hello, world!";
  }
}

package Server;

import Server.MyRemoteInterfaceImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
  public static void main(String[] args) {
    try {
      MyRemoteInterfaceImpl obj = new MyRemoteInterfaceImpl();
      Registry registry = LocateRegistry.createRegistry(1099);
      registry.bind("Hello", obj);
      System.out.println("Server ready");
    } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
      e.printStackTrace();
    }
  }
}

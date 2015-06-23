package RMIClient;
// Remote Interface

import java.rmi.*;

public interface TestInterface extends java.rmi.Remote {
	
	public void callTest (String st1) throws java.rmi.RemoteException;
	public void addVal (int num1,int num2) throws RemoteException;

}

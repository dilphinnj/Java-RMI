package test;
// Remote Interface

import java.rmi.*;

public interface TestInterface extends java.rmi.Remote {
	
	public void callTest (String st1) throws java.rmi.RemoteException;

}

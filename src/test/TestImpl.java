package test;
// Implementation class

import java.rmi.RemoteException;

import javax.rmi.PortableRemoteObject;


public class TestImpl extends javax.rmi.PortableRemoteObject implements TestInterface{

	protected TestImpl() throws RemoteException {
		super(); // The super method call invokes the no-argument constructor of javax.rmi.PortableRemoteObject
		}

	@Override
	public void callTest(String st1) throws RemoteException {
		
		 System.out.println( "Hello " + st1 + "!!" );
	     System.out.flush();
		
	}
	
	

}

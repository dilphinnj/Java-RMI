package RMIServer;
// Implementation class

import java.rmi.RemoteException;

import javax.rmi.PortableRemoteObject;


public class TestImpl extends javax.rmi.PortableRemoteObject implements TestInterface{

	protected TestImpl() throws RemoteException {
		super(); // The super method call invokes the no-argument constructor of javax.rmi.PortableRemoteObject
		}

	
	public void callTest(String st1) throws RemoteException {
		
		 System.out.println( "Hello from " + st1 + "!!" );
	     System.out.flush();
		
	}
	
	public void addVal(int num1,int num2) throws RemoteException {
		
		int val = num1 + num2; 
		System.out.println( "Value is =>" + val );
	     System.out.flush();
		
	}
	
	

}

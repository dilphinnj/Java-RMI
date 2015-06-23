package RMIServer;

//Test Server

import java.rmi.Naming;

import javax.naming.InitialContext;
import javax.naming.Context;


public class TestServer {

	    public static void main(String[] args) {
	        try {
	           
	            TestImpl TestRef = new TestImpl(); //The main method of the server needs to create an instance of the remote object implementation,

	          
	        	Naming.rebind("rmi://localhost/ABC", TestRef);
	        	 
	        	System.out.println("Server is ready.");
	        	}catch (Exception e) {
	        	System.out.println("Server failed: " + e);
	        	e.printStackTrace();
	        	}
	     }
	

}

package test;
//HelloClient.java
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import javax.rmi.*;
import java.util.Vector;
import javax.naming.NamingException;
import javax.naming.InitialContext;
import javax.naming.Context;

public class TestClient {

    public static void  main( String args[] ) {
        Context ic;
        Object objref;
        TestInterface hi;
        
        
    	TestInterface ti;
	    	try {
	    		
	    	//System.setSecurityManager(new RMISecurityManager());
	    	ti = (TestInterface)Naming.lookup("rmi://localhost/ABC");
	    	//int result=ti.add(9,10);
	    	ti.callTest("My name is Dillip");
	    	//System.out.println("Line is :"+);
	    	 
	    	}catch (Exception e) {
	    	System.out.println("HelloClient exception: " + e);
	    	}
    	}
        
        
        

       
    
    
}

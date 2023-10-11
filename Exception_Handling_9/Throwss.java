package Exception_Handling_9;

public class Throwss {
	
	    static void fun() throws IllegalAccessException
	    {
	        System.out.println("Inside fun(). ");
	        throw new IllegalAccessException("demo");
	    }
	    public static void main(String args[]) throws IllegalAccessException
	    {
	        try
	        {
	            fun();
	        }
	        catch(IllegalAccessException e)
	        {
	            System.out.println("caught in main.");
	        }
	        Throwss s =new Throwss();
	        s.fun();
	        
	    }
	}


package Exception_Handling_9;

public class Throw {

	
	    //function to check if person is eligible to vote or not   
	    public static void validate(int age) {  
	        if(age<18) {  
	    //    	System.out.println( "not eligible to vote");  
	        	  throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){  
	        //calling the function  
	        validate(15);  
	      
	  }    
	}


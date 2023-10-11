package Exception_Handling_9;

public class Fin_2 {
public static void main(String[] args) {
	
	System.out.println(1);
	System.out.println(2);
	try {                       //try Exception creator, catch is a handler
		System.out.println(3/0); 
	} catch(ArithmeticException ae){ 
		//ae.printStackTrace(); //for devloper,first show exception after show msg
	System.out.println("Sorry, / by zero is not allowed");
	}

	System.out.println(55);
	}
	
	
}


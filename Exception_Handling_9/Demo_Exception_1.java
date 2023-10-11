package Exception_Handling_9;

public class Demo_Exception_1 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3/0);
	   //Exception Handling 
		//(not problem solv, ye problem ko bypass krta he)
		//insuficiant balance
		
		
		//ex gmail wrong id pass enter, gmail will show wrong id pss
	try {//try Exception creator, catch is a handler
		System.out.println(3/0); 
	} 
//
	catch(ArithmeticException ae){ 
		//ae.printStackTrace(); //for devloper,first show exception after show msg
		System.out.println("Sorry, / by zero is not allowed");
	}
	
	
	
	
	finally {  // if exeption will reach or not finally blok will run every time
		System.out.println("im in final");
//		
	}
	System.out.println(4);
	System.out.println(5);
}
}
//1]Exception: It is an unwanted or unexpected event thrown at runtime that disrupts the normal flow of program.
//2]Error: error indicates serious problem which is irrecoverable.
//3]ExceptionHandling:it is a mechanism to handle the runtime erros so that normal flow of the prog can be maintained.

package Constructor_3;

public class Const_1 {

	void method(){
		System.out.println("I am in Method");
	}
	
	
    Const_1(){
		
    	System.out.println("I am Default Constructor");
    	
	}
	
Const_1(String a){
		
    	System.out.println(a);
    	
	}
	
	public static void main(String[] args) {
   Const_1 X = new Const_1("Welcome to mini cal"); // Const(); 1st call the Constructor
   X.method();           // After that call method

	}

}

package Basic_1;

public class Class_Method_Calling_5 {

		int a;  	
		float b;  	
		String str; 
		 
	 	public void operation1() { 
	 		a	= 10; 
	 		b	= 15.26f;// float value should be defined as decimal with f  	 	str = "Java"; 
	  
	 	} 
	 
	 	public void operation2() { 
	 	 	a = 20;  	 	
	 	 	b = 27f;  	 	
	 	 	str = "SELENIUM"; 
	 	} 
	 
	 	public void display() { 
	 	 	System.out.println("The Integer Value is :" + a); 
	 	 	System.out.println("The Float Value is :" + b); 
	 	 	System.out.println("The String Value is: " + str); 
	 	} 
	 
	 	
	 	void mathod1(int m, int n) {
	 		
	 		System.out.println(m + n); 
	 		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
public static void main(String args[]) {  	 
	 		Class_Method_Calling_5 obj = new Class_Method_Calling_5();
	 	 	obj.operation1();  	 
	 	 	obj.display(); 	
	 	 	obj.operation2(); 
	 	 	obj.display();
	 	 	obj.mathod1(5, 10);
	 	} 
	} 
	 




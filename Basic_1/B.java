package Basic_1;

 public class B {
	
	 
	 int a =10, b=5,c;
	 
	 
	
	static void add() {
		
		
	}
 
	
	
 void sub() {
	 
	 c=a-b;
	System.out.println("sub "+c);
	 
 }
 
 
 
 int mult() {
	 
	 c=a*b;
	System.out.println("mult "+c);
	 
	 
	return c;
 }
	 
	public static void main(String[] args) {
		
		
		B ax= new B();
	
		ax.add();
		ax.sub();
		ax.mult();
	} 
 }	
 
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.


			


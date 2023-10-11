package Abstraction_7;

  abstract class X {

	  abstract void start();
	  
 }
	  class Y1 extends X 
{

			 void start() {
				 
				 System.out.println("start with key");
			 }
			
			   
	  public static void main(String[] args) {
			Y1 b= new Y1();
			b.start();
			
		}
}
	// A method without having body(implementation) is known as abstract method
	  // A method always be declared in an abstract class, or we can say that if a class has an abstract method, it shuld be declared abstract as well
	  //if regular class extend abstract class, class must have to impliment all the abstract method of abstract parents class or it has to be declared abstract as well 
	  //in abstraction we use method overriding 
	  // we can't create object of abstract class
	  
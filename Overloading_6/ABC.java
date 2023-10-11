package Overloading_6;

class A{
	void show() {
		System.out.println("A show");
	}

	void dis() {
		System.out.println("A dis");
	}
	                 
		}

	 class B extends A {
		void show() {
			System.out.println("B show");
		}
		void dis() {
			System.out.println("B dis");
		}
	 }	
	 public class ABC {
	public static void main(String[] args) {
		A s =new A();
		s.show();
		s.dis();
		
		B s1 =new B();
		s1.show();
		s1.dis();
		
		A s4 =new B();
	    s4.show(); 
	    s4.dis(); 
	    s4.dis();
	    
	   
	 }

	}


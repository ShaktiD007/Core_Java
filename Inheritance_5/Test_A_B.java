package Inheritance_5;

public class Test_A_B {  // HAS-A relationship // relation between classes & IS-A is relationship between interface & class

		public static void main(String[] args) {
			
	//static polymorphism or compile time polymorphism
			B obj = new B();
			obj.test(); // here overridden method will be called
			obj.test3();
			obj.test1();
			obj.test2();
			
			System.out.println("*******************************************************");
			
			
			A obj1 = new A();//Parent class
			obj1.test();
			obj1.test1();
			obj1.test2();
			
			
			//super keyword:
			System.out.println("**********super keyword***********");
			obj.display();
			
			//Top casting:
			System.out.println("**************top casting*********************");
	//child class object can be refferd by parent class object reffernce variable.(Run time poly& dynamic poly)
			A obj2 = new B();//parent reff new child obj created
			obj2.test();
			obj2.test1();
			obj2.test2();
			
			
			//Down casting:is not allowed
			// in the down casting classcastException will be thrown.
			//B obj3 = new A();//parent class can not cast to child class
			
					
			
			 
	}

	}

	
	
	


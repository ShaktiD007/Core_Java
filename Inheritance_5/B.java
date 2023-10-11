package Inheritance_5;

	public class B extends A {
		
		int x=20;
	//Method overriding:same methd name wid same args are defined in diff class.
		
		public void test() // overridden method
		{
			System.out.println("Class B----------------------test method");
		}
		
		public void test3() 
		{
			System.out.println("Class B----------------------test3 method");
		}
					
		
						//for super keyword:
	//super keyword used to refer immediate call parent class object (variables,method & constructor)
		
		public void display()
		{
			System.out.println(x);//from class B
			System.out.println(super.x);//it will call from parent class variable
			test(); //class B method will be called
			super.test();//class A method will be called
			super.test1();
			super.test2();
		}
		public static void main(String[] args) {
			B t = new B();
			t.display();
			
		}
	}

	


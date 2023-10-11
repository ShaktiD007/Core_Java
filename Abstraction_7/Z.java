package Abstraction_7;

//Creating interface that has 4 methods  
	interface Z{  
	void a();//bydefault, public and abstract  
	void b();  
	void c();  
	void d();  
	}  

	//Creating abstract class that provides the implementation of one method of A interface  
	abstract class Bs1 implements Z{  
	public void c(){System.out.println("I am C");}  
	}  

	//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
	class M11 extends Bs1{  
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
	}  

	//Creating a test class that calls the methods of A interface  
	class ABC123{  
	public static void main(String args[]){  
	Z a=new M11();  
	a.a();  
	a.b();  
	a.c();  
	a.d();  
	}
	}  
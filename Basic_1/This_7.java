package Basic_1;

// This is a exact replacement of object creation
public class This_7 {
	int a=90;
	
	void show(){
	int a= 20;	
	System.out.println(a);	//20
	System.out.println(this.a); //90 using this call current clas value
	
	this.Disp(); //222 call method withod obj creation, save memory
	
	}
	
	void Disp() {
		
		System.out.println(222);
	}
	public static void main(String[] args) {
		
		This_7 A= new This_7(); //new keyword create memory
		A.show();
	}
}


//using this we call variable, method, and constructor















/*

class A
{
	int age=20;
}
class This extends A
{
	int age; // get value from this.age
	String name; //get value from this.name
	
	This(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	void show()
	{
		System.out.println(age+""+name);
	}
	public static void main(String[] args) {
		
		This ab=new This(10,"Java");
		ab.show();
		
	}
}
*/
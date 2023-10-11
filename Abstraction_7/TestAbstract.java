package Abstraction_7;

public class TestAbstract {

public static void main(String[] args) {
		
		//System.out.println(min_age);
		
		 System.out.println("****************************************************");
		 
		 //static time polymorphism:
		 ChildClass a = new  ChildClass();
		 
		 a.stop();//P
		 a.refuel();//P
		 a.start(); //C
		 a.milage(); //C
		 
		 
		 System.out.println("****************************************************");
		 
		 //Dynamic time polymorphism:
		 ParentClass US =new  ChildClass();
		US.start(); //C
		US.stop(); //P
		 US.refuel(); //P
		
		 System.out.println("valu"+a);
	}

}
//If there is an abstract method in a class, that class must be abstract.
				// Interface											//Abstract class
//1.in interface we achieve full abstraction.				//1.in AC we achieve partial abstraction.
//2.I can have only abstract methods.						//2.AC can have abstract & non abstract methods.
//3.I has only static & final variables.					//3.AC can have final,non final, static,nonstatic variables.
//4.the I keyword is used to declare I.						//4.the A keyword is used to declare abstract class.
//5.An I class can be implemented using keyword"implements". //5.an AC can be extended using keyword"extends".
//6.Members of java I are public Abstract by default.		//6.a java AC can have class members like private, protected, etc.
//7.I supports multiple inheritance.						//7.AC doesnt support multiple inheritance.
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.


	


package Basic_1;

public class practice {

void method1() {
	
}


void substraction(int a, int b) {
	//    c=50-20
	//   30 =50-20
	int c=a-b;
	System.out.println("Substraction is "+ c);
	
}







void mult(int a,int b, int c,int d) {
	
	int e= a*b*c*d;
	System.out.println("Multiplication is "+ e);
	
	
}





int add(int a, int b) {
	int c = a + b;
	System.out.println("Addition is " + c);
	return 56;
}

void method2() {
	System.out.println("I am method 2");
}
	
	public static void main(String[] args) {
		System.out.println("Hello Java ");
		System.out.println("Maxgen");
		
		practice a= new practice();
		
		a.method1();
		a.method2();
		a.substraction(50, 20);
		a.mult(5, 4, 10, 15);
	}
	
	
	
}

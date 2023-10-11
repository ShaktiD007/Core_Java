package Exception_Handling_9;

public class Try_Catch {
public static void main(String[] args) {
	
//	try {
//		int a= 3/0;
//	} catch (ArithmeticException e) {
//		
//		
//		System.out.println(e);
//		System.out.println("Hello");
//	}



try {
	int a[]= {1,2,3,4};
	System.out.println(a[4]);
} catch (ArrayIndexOutOfBoundsException e) {
	
	System.out.println(e);
}

finally {
	System.out.println("Finally Block alwayse be executed");
}





}
}

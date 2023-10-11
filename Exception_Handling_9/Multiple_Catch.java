package Exception_Handling_9;

public class Multiple_Catch {

	public static void main(String[] args) {

		
		try {
			//int a=50/0;
			int a[]= {1,2,1,2};
			System.out.println(a[4]);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
	}

}

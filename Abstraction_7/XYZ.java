package Abstraction_7;




abstract class bike{
	
abstract void Honda();
	
}

class vehicle extends bike{
	
	void Honda() {
		
		System.out.println("Honda Bike is running");
	}
}


public class XYZ {

	public static void main(String[] args) {
		vehicle x = new vehicle();
		x.Honda();

	}

}

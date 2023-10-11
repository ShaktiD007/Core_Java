package Overloading_6;

	 class Vehicle{	
		void run() {
			System.out.println("Vehicle is running");
	}
}
		class Bike extends Vehicle {
			void run() {
			System.out.println("Bike is Running");
	}	
}
		class Car extends Bike {
		void run() {
			System.out.println("Car is running");
	}
}




	public class Overriding {
		
		
		public static void main(String[] args) {
			
			Vehicle sp= new Vehicle();
			sp.run();
			
			Bike bk= new Bike();
			bk.run();
			
			Car cs= new Car();
			cs.run();
			
		
			
		}

	}
/*
	Same method name
	same parameters
	requires inheritance
Method overriding is used for runtime polymorphism

	*/
	


package Inheritance_5;

	class Employee {
		int empid =101;
		String empname = "Shakti";
		int a=200;
	}

	public class Single_Inherit_1 extends Employee {

		int a=10;
		String desiganation = "Softaware Tester";
		
		void showdata() {
			System.out.println(super.a);
			System.out.println("Employee ID: " +empid);
			System.out.println("Name :" +empname);
			System.out.println("Desgination: "+desiganation );
			
		}

		
		public static void main(String[] args) {
			Single_Inherit_1 si =new Single_Inherit_1();
		
			si.showdata();

		}
	}
	
	


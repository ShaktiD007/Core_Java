 package Overloading_6;

import Basic_1.B;

public class Demo_Methodoverloading {

int data( int x , int y) {
		int c=x+y;
		return c;
		
	}
	double data(Double x, Double y, Double z) {
		
		return x+y+z;
	}
	
		
	
	public static void main(String[] args) {
		
		Demo_Methodoverloading sc= new Demo_Methodoverloading();
		
	//	int z=
				int o = sc.data(15, 5);
				
		 System.out.println(o);
		double d=sc.data(15.5, 1.5,4.6);
		
		System.out.println(d);
	}
}
/*
 
 Println Example
//1.Duplicate methods are not allowed.
//2.Method overloding:same class,same mthd name but diff no of arguments
	//if no of arg will be same then their data type must be different
//3.cuz of duplicacy,java compiler will confuse that which methd we have to call,
	//thats why same methd with same args are not allowed.

		public void sum()
		{
			System.out.println("sum methd with zero parameters");
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
		
		 }
		public void sum(int x, int y)
		{
			System.out.println("sum methd with two int parameters");
			int d=x+y;
			System.out.println(d);
		
		 }
		public void sum(double h, double i)
		{
			System.out.println("sum methd with two double parameters");
			double m=h+i;
			System.out.println(m);
		
		 }
		public static void main(String[] args) {
			
			Demo_Methodoverloading obj= new Demo_Methodoverloading();
			obj.sum();
			obj.sum(40, 30);
			obj.sum(10.33, 60.30);
		}}  */
		



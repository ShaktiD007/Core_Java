package Basic_1;


public class Super_This_B extends Super_This_A_8{

	int x= 50;
	
	void mx(){
		
		int y=88; 
		
		System.out.println(y); //88
		System.out.println(this.x); //50
		System.out.println(super.a); //10
		
	}
	
	
	
	public static void main(String[] args) {
		
		Super_This_B v = new Super_This_B();
		v.mx();
		v.m2();
	
	}

}



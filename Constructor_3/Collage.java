package Constructor_3;

public class Collage {
// if we want any work before method thats wy we use constructor
	Collage(){
		System.out.println("Welcome to ZP collage"); // if only one customer
	}
			
	void getAdmission(){
		System.out.println("Admission Success");
	}
	
	public static void main(String[] args) {
		
	Collage X=new Collage();
		X.getAdmission();
	}

}

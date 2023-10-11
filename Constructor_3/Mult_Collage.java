package Constructor_3;

public class Mult_Collage {

	Mult_Collage (){
		System.out.println("1 Month free trial");	
	}
	
	Mult_Collage(String collageName){
		System.out.println("Welcome to "+ collageName);
	}
	
	    void getAdmission(){
		System.out.println("Admisssion Success");
	}
	
	public static void main(String[] args) {
		
		Mult_Collage x2= new Mult_Collage();
		x2.getAdmission();
		
     	Mult_Collage x=new Mult_Collage("TGPCET");
          x.getAdmission();
          
      //    Mult_Collage Y=new Mult_Collage("ZP");
      //    Y.getAdmission();
          
          
	}
}

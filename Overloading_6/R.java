package Overloading_6;

public class R {

	public static void main(String[] args) {
		P s =new P();
		s.show();
		s.dis();
		
		Q s1 =new Q();
		s1.show();
		s1.dis();
		
		P s4 =new Q();
	    s4.show(); 
	    s4.dis(); 
	    s4.dis();
	    

	}

}

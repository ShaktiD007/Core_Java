package Basic_1;

public class Global_Local_Variables_3 {
	int a=154;
//	System.out.println(a);
	//Instance=global it is only place in inside class and outhside method
    static int h=56; // static use for call the variable 
	// we can call static method by using class name or object creation
   
    void div(){
    	int j=5; //Local variable only work in his method
    	int k=a+j;
    	System.out.println(k);
    
    }

    static void mul(){
    	int l=5; //Local vari
    	
    	System.out.println("static method "+ l);
    	}
    public static void main(String[] args) {
		int Z= 10;
		System.out.println(Z);
		
        System.out.println(Global_Local_Variables_3.h);
        
		
		mul();//static di
		Global_Local_Variables_3.mul(); //static
	
		
		Global_Local_Variables_3 X = new Global_Local_Variables_3();
		System.out.println(X.a);
		System.out.println(X.h);
		//System.out.println(X.k); No Localvariable call
//	System.out.println(div.j);
		
		
	}
	
}

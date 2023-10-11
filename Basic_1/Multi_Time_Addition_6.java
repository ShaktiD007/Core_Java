package Basic_1;

class Multi_Time_Addition_6 {
	
	
	
	
	
	
	// (input)MethodName(Output)
	 int add(int a, int b) {
		int c = a + b;
		System.out.println("Addition is " + c);
		return c;
	}

	void sub(int a, int b) {
		int c = a - b;
		System.out.println("Substration is " + c);
	}

	void multi(int a, int b, int c){
		int d= a*b*c;
		System.out.println("Multiplication is "+ d);
	}
	
	int div(int a, int b){
		int c=a/b;
		System.out.println("Substraction is "+ c);
		return 42675;
		
		}
	
	void Per(int a,int b, int c){
		int e= (a+b+c)*100 ;
		int G= e/300;
		System.out.println("percent is "+ G +"%");
	}
	
	void avr(int a, int b){
    int c= a+b;
    int d= c/2;
System.out.println("Average is " + d);
	}
	
	
	
	Multi_Time_Addition_6(){
		
		System.out.println("Welcome To Mini Calculator");
		
	}
	public static void main(String[] args) {
		
		Multi_Time_Addition_6 X = new Multi_Time_Addition_6();
	
		X.add(5,6);
		
		
		
			}
	
}


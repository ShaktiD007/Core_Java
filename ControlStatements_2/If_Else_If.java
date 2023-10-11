package ControlStatements_2;

public class If_Else_If {

	public static void main(String[] args) {
		String browser="safari";
		
		if(browser=="Chrome")//condition
		{
			System.out.println("Chrome Browser will open");
		}
		else if(browser=="Firefox")
		{
			System.out.println(" Firefox Browser will open");
		}
		else if(browser=="safari")
		{
			System.out.println("safari Browser will open");
		}
		else 
		{
			System.out.println("no Browser will open");
		
		}
	}
} 

/*
public static void main(String[] args) {  
    int marks=65;  
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!");  
    }  
}  
}  */

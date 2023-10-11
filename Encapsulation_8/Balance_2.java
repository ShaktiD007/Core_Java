package Encapsulation_8;

public class Balance_2 {
	public static void main(String[] args) {
		
		Bank_2 t =new Bank_2();
		
		t.getBalance();
 	
		t.Balance = 0;
		System.out.println(t.Balance);

   	 t.setBalance(500);

   	 
System.out.println(t.getBalance());		
		
	}

}

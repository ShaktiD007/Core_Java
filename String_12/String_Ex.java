package String_12;

public class String_Ex {

public static void main(String[] args) {
		
		String s =new String ("shakti");
		System.out.println(s.toLowerCase());
		
		String c="Hello World";
		System.out.println(c);
		
	
		//1.Length():Returns number of characters
				System.out.println(s.length());
			
				
		//2.char charAt(int i): Returns the character at ith index
				System.out.println(s.charAt(3));
				
				
		//3.String substring(int i): Returns d substring from ith index character to end
				System.out.println(s.substring(3));
				System.out.println(s.substring(1,4));
				
		//4.concat(String str):concatenates specified string at d end of string
				System.out.println(s.concat(s));
				
		//5.toUpparCase():it will convert all letters uppar case
				System.out.println(s.toUpperCase());
				
		//6.toLowerCase():it will convert all letters lower case
				System.out.println(s.toLowerCase());
				
		//7.trim():eliminates white spaces before as well as end from string
				String s2="   Sele_nium   ";
				System.out.println(s2);
				System.out.println(s2.trim());
				
		//8.startsWith(): and endsWith():it will return boolean value
				System.out.println(s.startsWith("h"));
				System.out.println(s.endsWith("i"));
				
		//9.replace():replace all occurrences of first sequence of character with second sequence of character
				String s3="Hello Java. Hello Selenium.";
				System.out.println(s.replace("s", "b"));
				System.out.println(s3.replace('H', 'Z'));
				
		//10.equals():compare d string to d specified object or string
				System.out.println(s.equals("shakti"));
				System.out.println(s.equalsIgnoreCase("SHAKTi"));
		
		
		
	}
	
}

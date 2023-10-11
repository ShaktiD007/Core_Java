package ControlStatements_2;

public class Switch {

public static void main(String[] args) {
		
		int i=10;  //int ch='a';
		switch(i) //switch (ch) - if not find vale then it directly shift next 
		{
		case 1: //code to be executed
			System.out.println("value is one");
			break; //optional
		case 2:
			System.out.println("value is two");
			break;
		case 3:
			System.out.println("value is three");
			break;
		case 4:
			System.out.println("value is four");
			break;
		case 5:
			System.out.println("value is five");
			break;
		default:
			System.out.println("value is greater than five");
		}
	}
}
   
   

//Home work One to ten =1 and vovels or consonent
//599 madhe ky value ahe te directly aplala baghta yeto

/*
SWITCH CASE STATMENT:
1. Multi Branch statement
2.we use in java when we have one or multiple option to select
3.It executes particular option based on the value of an expression.
4.Duplicate case values are not allowed.
5.default statement is optional.
6.break statement is also optional.
7.Expression: byte,short,int,char,string.
*/

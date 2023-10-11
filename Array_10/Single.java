package Array_10;


public class Single {


		//concept of Array
//1.Array:It is used store similar data types(Homogeneous) values in an array variables
//2.all values are store in continuous memory location
//3.Array starts from '0' index
//4.size of array must be specified by an int
//5.if size of array exceeds then "ArrayIndexOutOfBoundEsxception"occur

public static void main(String[] args) {
				
	//1]int Array


System.out.println("***********int array**************");





int Shakti[]= new int [4];

Shakti[0]=10; 
Shakti[1]=50;
Shakti[3]=100;
Shakti[2]=55;




System.out.println("Length of array is "+ Shakti.length);


for(int i=0; i<Shakti.length; i++ ) {
	
	System.out.println("Array of Shakti["+i+"] =" +Shakti[i]);
}






          int x[]=new int [4];// x:ref variable ,4 size of array memory allocation will be done
           x[0]=10;//Initialization of values
           x[1]=20;
           x[2]=30;
           x[3]=40;
           
System.out.println(x.length);//find out array size
System.out.println(x[2]);//any element directly access

for(int i=0;i<x.length;i++)// loop use for iteration
{
	System.out.println(x[i]);
}


					//2] double Array

System.out.println("*******double array**************");
double d[]=new double [4];
d[0]=10.11;
d[1]=20.22;
d[2]=30.33;
d[3]=40.44;

for(int j=0;j<d.length;j++)//print a
	
{
	System.out.println(d[j]);
}

					//3] char Array

System.out.println("*******char Array*************");
char c[]=new char [4];
c[0]='A';
c[1]='B';
c[2]='C';
c[3]='D';

for(int k=0;k<c.length;k++)
	
{
	System.out.println(c[k]);
}


						//4] string Array

System.out.println("*******string Array*************");
String s[]=new String [4];
s[0]="java";
s[1]="php";
s[2]="python";
s[3]="ruby";
		
for(int z=0;z<s.length;z++)
			
{
	System.out.println(s[z]);
}
//Disadvantage of Array:
//1.size is fixed:to overcome this problem we used Arraylist,hashtable
//2.similar data types:to overcome this problem we used "object array".
		
}

}

	


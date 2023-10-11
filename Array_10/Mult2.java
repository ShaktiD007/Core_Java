package Array_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import sun.security.util.Length;

public class Mult2 {
	public static void main(String[] args) {
		 
		int x[]=new int [4];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;//data type, size, index compulsury
		
		for(int i=0; i<x.length;i++) {
			System.out.println(x[i]);
		}
			
	System.out.println("********************************");
	
	//Generics
ArrayList <Integer>pm = new ArrayList<>();
pm.add(50);
pm.add(20);
pm.add(80);
pm.add(40);

System.out.println(pm);
System.out.println("********************************");
//ArrayList is a class of collection framework 
//foreach loop
for (Integer abc : pm) {
	System.out.println(abc);
}
System.out.println("********************************");

Collections.sort(pm);
for (Integer abc : pm) {
	System.out.println(abc);
}
System.out.println("********************************");



System.out.println(Collections.max(pm));
System.out.println(Collections.min(pm));

}}
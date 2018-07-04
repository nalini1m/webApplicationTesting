package com.BasicJava;

public class ArrayExample {

	public static void main(String[] args) 
	{
		// Single Dimensional Array
		
		// dataType[] ArrayName = new dataType[size]
		    //    OR
		// dataType ArrayName[] = new dataType[size]
		
		int a[] = new int[3];
		// Array index start with 0
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//a[3]=40;
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		

	}

}

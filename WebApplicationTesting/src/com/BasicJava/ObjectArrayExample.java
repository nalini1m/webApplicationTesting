package com.BasicJava;

public class ObjectArrayExample {

	public static void main(String[] args)
	{
		// To store multiple values of Different DataType
		
	/*	Object[] ArrayName = new Object[size]
				or 
		Object ArrayName[]= new Object[size]*/
		
		Object [] a = new Object[3];
		
		a[0]= "Java";
		a[1]= 123;
		a[2]= 123.45;
		
		// for Each
		
		for(Object hi:a)
		{
			System.out.println(hi);
		}

	}

}

package com.BasicJava;

public class MultiDimensionalArrayExample {

	public static void main(String[] args)
	{
	/*	dataType[][] ArrrayName = new dataType[size][size]
				or
		dataType ArrayName[][] = new dataType[size][size]*/
		
		String a[][]= new String[2][2];
		
		a[0][0] = "ram";
		a[0][1]="Hello";
		
		a[1][0]= "Hii";
		a[1][1]= "Raj";
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}

}

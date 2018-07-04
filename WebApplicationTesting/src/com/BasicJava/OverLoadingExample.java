package com.BasicJava;

public class OverLoadingExample
{

	public void mobile(String x)
	{
		System.out.println("My Mobile Name is : "+ x);
	}
	
	public void mobile(int x)
	{
		System.out.println("My Mobile cost is :"+ x);
	}
	
	
	public static void main(String[] args) 
	{
		OverLoadingExample o = new OverLoadingExample();
		
		o.mobile("Sony");
		o.mobile(1000);
		
		

	}

}

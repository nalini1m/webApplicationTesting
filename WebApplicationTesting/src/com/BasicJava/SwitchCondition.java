package com.BasicJava;

public class SwitchCondition {

	public static void main(String[] args)
	{
		/*Switch(expression)
		{
			case value:
				statements
				break;
			
			case value:
				statements	
				break;
		}*/
		
		int number=40;
		switch(number)
		{
		case 10:
			System.out.println("10");
			break;
			
		case 20:
			System.out.println("20");
			break;
			
		case 30:
			System.out.println("30");
			break;
			
		default:
			System.out.println("Not in 10,20,30");
		}

	}

}

package chapter5;

import java.util.Scanner;

public class check_double {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		String s=sc.nextLine();
		try 
		{
			System.out.println(Double.parseDouble(s) +" is a valid number.");
		}catch (Exception e) 
		{
			System.out.println(s+" is invalid");
		}
		
		sc.close();
	}

}

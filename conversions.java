package chapter5;

import java.util.Scanner;

public class conversions {

	public static void main(String[] args) 
	{
		//when the input is in integer form
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number(INTEGER) ");
		int a=sc.nextInt();
		System.out.println(Integer.toString(a, 2));
		System.out.println(Integer.toString(a, 8));
		System.out.println(Integer.toString(a, 10));
		System.out.println(Integer.toString(a, 16));
		
		//when the input is String
		System.out.println("\nenter the number(STRING) ");
		String s=sc.next();
		System.out.println(Integer.parseInt(s, 2));
		System.out.println(Integer.parseInt(s, 8));
		System.out.println(Integer.parseInt(s, 10));
		System.out.println(Integer.parseInt(s, 16));

		sc.close();
		
	}

}

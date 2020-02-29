package chapter5;

import java.util.Scanner;

public class correct_plurals 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		System.out.println("we have used "+n+" item"+(n > 1?"s":""));
		sc.close();
	}

}

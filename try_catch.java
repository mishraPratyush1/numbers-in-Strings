package chapter5;

import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String n=sc.next();
		try {
			System.out.println(Integer.parseInt(n));
		} catch (Exception e) {
			System.out.println(n+" is invalid");
		}
		
		sc.close();
	}
	

}

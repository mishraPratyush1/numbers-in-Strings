package chapter5;

import java.util.Scanner;

public class GeneratePallindromeNumbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:\n");
		int n=sc.nextInt();
		int c=0,rev=0,rem;
		if(n>=0 && n<9)
			System.out.println(n+" is a pallindrome");
			
		else 
		{
			while(n!=0) 
			{
				rem = n%10;
				rev= (10*rev)+rem;
				n/=10;
				
			}
		}		
		System.out.println(pallindrome(n+rev));		
			
			

	}
	public static int pallindrome(int num)
	{
		StringBuffer s=new StringBuffer(num);
		if(s.equals(s.append(s.reverse())))
			
			
	}
	

}

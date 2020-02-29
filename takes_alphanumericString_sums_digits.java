package chapter5;

import java.util.Scanner;

public class takes_alphanumericString_sums_digits {

	public static void main(String[] args) 
	{
		var sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		int sum=0;
		
		//checks for a single digit
//		for (int i = 0; i < s.length(); i++) 
//		{
//			if(Character.isDigit(s.charAt(i))) 
//			{
//				sum+=(Integer.parseInt(Character.toString(s.charAt(i))));
//				// Character.toString(s.charAt(i))) converts the character to a string and 	Integer.parseInt(Character.toString(s.charAt(i)))
//				//convers the string to an integer.							
//			}
//				
//		}
//		
		//checks for multiple inputs.
		
		String s1="";
		
		for (int i = 0; i < s.length(); i++) 
		{
		if(Character.isAlphabetic(s.charAt(i)))
			s1=s1+" ";

		else if(Character.isDigit(s.charAt(i)))
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		s1.trim();

		String k[]=s1.split("[ ]+");
		for (int i = 0; i < k.length; i++)
		sum=sum+Integer.parseInt(k[i]);

		System.out.println(sum);

	}

}

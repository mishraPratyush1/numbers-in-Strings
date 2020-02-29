package chapter5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Decimal_Format_Pattern_Characters 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		NumberFormat a=NumberFormat.getInstance();
		System.out.println("enter the number ");
		double s=sc.nextDouble();
		
		//  #  Numeric digit (leading zeros suppressed)
		
		NumberFormat p=new DecimalFormat("###.##"); //minimum no of integer digits as well as fraction digits
		NumberFormat p1=new DecimalFormat("000.##"); //it takes three zeroes before decimal
		NumberFormat p2=new DecimalFormat(",##.##"); //pairs number from left to right.
		NumberFormat p3=new DecimalFormat(",###.##"); //triplets number from left to right.
		
		System.out.println(p.format(s));
		System.out.println(p1.format(s));
		System.out.println(p2.format(s));
		System.out.println(p3.format(s));
		sc.close();
		

	}

}

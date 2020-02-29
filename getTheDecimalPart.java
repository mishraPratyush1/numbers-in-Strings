package chapter5;

import java.util.Scanner;

public class getTheDecimalPart {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double k=sc.nextDouble();
		int a=(int)k;
		k=k-a;
		System.out.println(a+" "+k);
		sc.close();
		
		int h=2*5/3;
		System.out.println(h);
		System.out.println((2*5)/3d);
		
		Integer q=10;
		System.out.println(q.intValue());
		System.out.println(1d); //gives output as 1.0.
	}

}

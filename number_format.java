package chapter5;
import java.text.NumberFormat;
import java.util.Scanner;
public class number_format {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		NumberFormat a= NumberFormat.getInstance(); //warning!!! no NEW keyword is used here!!
		a.setMaximumIntegerDigits(4);
		a.setMinimumIntegerDigits(2);

		System.out.println("enter the minimum fraction digits:");
		int p=sc.nextInt();
		System.out.println("enter the maximum fraction digits:");
		int p1=sc.nextInt();
		a.setMaximumFractionDigits(p1);
		a.setMinimumFractionDigits(p);
		
		double d=.345;
		System.out.println(a.format(d));
		sc.close();

	}

}

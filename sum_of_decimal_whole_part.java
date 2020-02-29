package chapter5;
//takes a real number
import java.util.Scanner;

public class sum_of_decimal_whole_part {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.next();
		try {
			double temp=Double.parseDouble(s);
		} catch (Exception e) {
			System.out.println("invalid no of dots!!!!!!");
		}
		int sum=0;
		String []k=s.split("[.]");
		sum+=Integer.parseInt(k[0])+Integer.parseInt(k[1]);
		System.out.println("sum of whole and fractional part = "+sum);
	}

}

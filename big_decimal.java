package chapter5;

import java.math.BigDecimal;
import java.math.BigInteger;

public class big_decimal {

	public static void main(String[] args) 
	{
		BigInteger a=new BigInteger("2");
		BigInteger w=new BigInteger("4");
		BigDecimal b=new BigDecimal(a);
		BigDecimal k=new BigDecimal(w);
		System.out.println(b);
		System.out.println(b.intValue());
		System.out.println(b.divide(k));
		

	}

}

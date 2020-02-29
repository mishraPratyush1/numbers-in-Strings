package chapter5;

import java.math.BigInteger;

public class big_integer_start {

	public static void main(String[] args) 
	{
		BigInteger a=new BigInteger("324232133343235"); //when you are converting from one base to other we have to fix no of digits
		BigInteger b=new BigInteger("23435762374862378");
		//intValue() converts
		System.out.println("int value"+a.intValue());
		System.out.println("double value"+a.doubleValue());
		System.out.println("add "+a.add(b));
		System.out.println("sub "+a.subtract(b));
		System.out.println("mul "+a.multiply(b));
		System.out.println("divide "+a.divide(b));
		System.out.println("compare to "+a.compareTo(b));
		System.out.println("abs a "+a.abs()+" abs b "+b.abs());
		System.out.println("equals "+a.equals(b));
		System.out.println(a.bitCount());
		
		
		
		//byte range is -128 to 127 total no of nos=(127-(-128))+1=256.
		byte k=(byte)256; //(value-256) is the answer
		System.out.println(k);
		

	}

}

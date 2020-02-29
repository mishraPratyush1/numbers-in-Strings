package chapter5;

public class is_NAN {

	public static void main(String[] args) {

		double a=-10.0;
		double b=0;
		System.out.println(a/b); //-infinity
		System.out.println(Math.sqrt(-1)); //NAN
		double k=Math.sqrt(-1);
		
			if(Double.isNaN(k))
			{
				System.out.println(k);
			}
		
//		int/0 -> dividebyZero Exception
//		+double/0 ->infinity
//		-double/0 -> -infinity
		double d=123;
		double e=0;
		System.out.println(d/e);
		if(d/e==Double.POSITIVE_INFINITY)
		{
			System.out.println("positive infinity works");
		}

	}

}

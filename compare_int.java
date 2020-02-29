package chapter5;

public class compare_int {

	public static void main(String[] args) 
	{
		String s="10";
		String b="11";
		System.out.println((s.compareTo(b))); 
		System.out.println(Integer.compare(Integer.parseInt(s), Integer.parseInt(b)));
		

//		a.compareTo(b)        compare(a,b)
//		-string as parameter   -integer paramaters.
	}

}

package chapter5;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) 
	{
		Random a=new Random();
		for (int i = 0; i < 20; i++) 
		{
			// nextInt(10) goes from 0-9; 
			//add 1 for 1-10;
			System.out.println(2+a.nextInt(10));
			//outputs any integer number between (4+10)-1

		}

	}

}

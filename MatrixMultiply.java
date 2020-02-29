package chapter5;

import java.util.Scanner;

public class MatrixMultiply {

	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows and columns\n");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		System.out.println("enter the first array:");
		int a[][]=new int[row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the no of rows and columns\n");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		System.out.println("enter the second array:");
		int b[][]=new int[row2][col2];
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				b[i][j]=sc.nextInt();
			}
		}
			if(row2!=col1) 
			{
				System.err.println("Can't be multiplied:");
				System.exit(0);
			}
		
			int result1[][]=multiply(a, b,row1,col2);
			System.out.println("resultant matrix\n");
			for (int i = 0; i < result1.length; i++) 
			{
				System.out.print("[");
				for (int j = 0; j < result1[0].length; j++) {
					System.out.print(result1[i][j]+" ");
				}
				
				System.out.print("]");
				System.out.println();
			}
		
		
		
		sc.close();
		
	}
	public static int[][] multiply(int a[][],int b[][],int row1,int col2)
	{
		int i=0,j=0;
		int result[][]=new int[a.length][b[0].length];
		for ( i = 0; i < a.length; i++) {
			for (j = 0; j < b.length; j++) {
				for (int k = 0; k < b.length; k++) {
					result[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return result;
		
	}

}

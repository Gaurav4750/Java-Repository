import java.lang.*;
import java.util.*;

class IdentityMatrix {
	
	// To print the 2d array.
	public static void Print2DArray(int[][] mat)
	{
		int N = mat.length;
		int M = mat[0].length;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// To perform multiply the matrixes.
	public static int[][] Matrix_Multiply(int[][] A, int[][] B)
	{
		int r1 = A.length;
		int c1 = A[0].length;
		int r2 = B.length;
		int c2 = B[0].length;
		int[][] out = new int[r1][c2];
		
		for(int row =0; row<r1; row++)
		{
			for(int col =0; col<c2; col++)
			{
				int sum =0;
				
				for(int i=0; i<c1; i++)
				{
					sum = sum + (A[row][i]*B[i][col]);
				}
				out[row][col] = sum;
			}
		}
		return out;
	}
	
	// Identity matrix
	public static int[][] Identity_Mat(int len)
	{
		int[][] res = new int[len][len];
		
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len; j++)
			{
				if(i==j)
				{
					res[i][j] = 1;
				}
			}
		}
		return res;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int len = sc.nextInt();
		
		int[][] mat1 = new int[r1][c1];
		int[][] mat2 = new int[len][len];
		
		for(int i=0; i<r1;i++)
		{
			for(int j=0; j<c1; j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		
		mat2 = Identity_Mat(len);
		
		if(c1==len)
		{
			Print2DArray(Matrix_Multiply(mat1,mat2));
		}
		else{
			System.out.print("Matrix Multiplication requires same number of columns in Matrix 1 and rows in Matrix 2");
		}
		
	}
}

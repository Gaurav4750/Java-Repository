import java.lang.*;
import java.util.*;

class Main {
	public static void Reversepart(int ar[],int s1,int s2)
	{
		int p1= s1, p2=s2;
		
		while(p1<p2)
		{
			int temp = ar[p1];
			ar[p1] = ar[p2];
			ar[p2] = temp;
			p1++;
			p2--;
		}
	}
	
	public static void RotateArray(int ar[], int k)
	{
		int N = ar.length;
		
		Reversepart(ar,0,N-1);
		Reversepart(ar,0,k-1);
		Reversepart(ar,k,N-1);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int le = sc.nextInt();
		int order = sc.nextInt();
		int arls[] = new int[le];
		
		for(int i=0; i<le; i++)
		{
			arls[i] = sc.nextInt();
		}
		
		RotateArray(arls,order);
	}
}
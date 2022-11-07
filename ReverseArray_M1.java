// User wants to reverse the given array

import java.lang.*;
import java.util.*;

class Main {
	public static void Reverse(int ar[])
	{
		int p1= 0, p2=ar.length -1;
		
		while(p1<p2)
		{
			int temp = ar[p1];
			ar[p1] = ar[p2];
			ar[p2] = temp;
			p1++;
			p2--;
		}
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int le = sc.nextInt();
		int arls[] = new int[le];
		
		for(int i=0; i<le; i++)
		{
			arls[i] = sc.nextInt();
		}

		Reverse(arls);
	}
}

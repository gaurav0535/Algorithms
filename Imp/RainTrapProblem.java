package Imp;

public class RainTrapProblem {

	public static void main(String arr[])
	{
		
	}
	
	int findTotalWater(int a[], int n ){

		  int l[];
		  int r[];
		  int sum =0;

		   // calclutae the left tallest
		    l[0] = a[0];
		    for(int i=1;i<n;i++)
		       l[i] = max(a[i],l[i-1]);

		   // calclutae the right tallest
		    r[n-1] = a[n-1];
		    for(i=n-2;i>=0;i--)
		       r[i] = max(a[i],r[i+1]); 

		       for(i=0;i<n;i++)
		         sum = sum + (min(l[i],r[i]) - a[i])*1;

		}

	
}

package Imp;

public class MaxArray {

	public static void main(String[] args) 
	{
		int a[] = {6,2,4,5,3,1};
		
		
		int n =a.length;
		int max = a[n-1];
		a[n-1] = -1;
		System.out.println(n);
		System.out.println(max);
		for(int i=n-2;i>0;i--)
		{
		//	System.out.println(max);
			int t = a[i];
		//	System.out.println(t);
			if(max >a[i+1] )
			{
				a[i] = max;
			}else {
				a[i] = a[i+1];
			}
			
			if(max<t)
			{
				max = t;
			}
			
		}
		for (int i=0;i<n;i++)
		{
		System.out.print(a[i]);
		}
		// TODO Auto-generated method stub

	}

}

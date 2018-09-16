
public class Fib_array {

	public static void main(String arr[])
	{
		int[] a ;
		a = new int[100000];
		int n=100000;
		a[0]=0;
		a[1]=1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(int i =2 ;i<100000;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println(a[i]);
		}
				
	}
	
	
}

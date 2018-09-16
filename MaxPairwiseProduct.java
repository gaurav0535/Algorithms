import java.util.*; 
import java.io.*;

public class  MaxPairwiseProduct {
	static long getMaxPairwiseProduct(long[] numbers) {
		long product = 0; 
		int n = numbers.length;
		long temp = 0;
		long max= 0;
		int index = 0;
		for(int i =0;i<n;i++)
		{
			if(numbers[i]>max)
			{
				max = numbers[i];
				index = i;
			}
		}
		Arrays.sort(numbers);
		//Sort(numbers);
	/*	long max2 = 0;
		for(int i =0;i<n;i++)
		{
			if(numbers[i]>max2)
			{
				if(numbers[i]<max)
				{
					max2=numbers[i];
				}
				
			}
		}
		*/
		
/*		for (int i = 0; i < n; ++i)
		{
			
			for (int j = i + 1; j < n; ++j)
			{
				if(numbers[i]>numbers[j])
				{
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j]=temp;		
				}
			//	product = Math.max(product, numbers[i] * numbers[j]);
				
			}
		}
		
		*/
		product = numbers[n-2]*numbers[n-1];
		return product;
	}
	
public static void main(String arr[])
{
	FastScanner scanner = new FastScanner(System.in); 
	int n = scanner.nextInt(); 
	long[] numbers = new long[n]; 
	for (int i = 0; i < n; i++) 
	{
		numbers[i] = scanner.nextInt();
	}
	System.out.println(getMaxPairwiseProduct(numbers));
}
static class FastScanner
{
	BufferedReader br; 
	StringTokenizer st;

	FastScanner(InputStream stream) 
	{
		try {
			br = new BufferedReader(new InputStreamReader(stream));
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public int nextInt() {
		// TODO Auto-generated method stub
		return Integer.parseInt(next());

//		return 0;
	}
	String next() { 
		while (st == null || !st.hasMoreTokens()) { 
			try {

				st = new StringTokenizer(br.readLine()); 
			} catch (IOException e) { 
				e.printStackTrace();

			}
		}
		return st.nextToken();

	}
	
			}
		
	
		
}




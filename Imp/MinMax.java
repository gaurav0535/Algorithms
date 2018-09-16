package Imp;

public class MinMax {
	
	public static void main(String arr[])
	{
	
	int[] arr1 = {5,5,5,5,5};
	
	  
      int min=0;
      int max=0;
      min=arr1[1];
      max=arr1[1];
      for(int i=0;i<5;i++)
      {
          if(arr1[i]<=min)
          {
              min = arr1[i]; 
          }
      
       }
      for(int i=0;i<5;i++)
      {
          if (arr1[i]>=max)
          {
              max= arr1[i];
          }
      }
      long min_sum=0;
      long max_sum=0;
     System.out.println(min);
     System.out.println(max);
      for(int i=0;i<5;i++)
      {
          if(arr1[i]!=min)
          {
              max_sum = max_sum+arr1[i];
              
          }
          if(arr1[i]!=max)
          {
              min_sum = min_sum+arr1[i];
          }
          if(max==min)
          {
              min_sum =min_sum+arr1[i];
              max_sum =max_sum+arr1[i];
          }
      }
      System.out.println((min_sum) + " " + (max_sum));

	}

}

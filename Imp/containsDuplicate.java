package Imp;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,1};
		int n=a.length;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					flag = flag+1;
					break;
				}
				if(flag !=0)
				{
					break;
				}
			}
		}
		if(flag!=0)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

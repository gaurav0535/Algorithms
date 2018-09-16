package Imp;

public class XOR {

	public static void main(String[] arr)
			{
				int temp_a = 0;
				int temp_b = 0;
				String a="abcd";
				String b="dcba";
				//System.out.println("Check the value in XOR");
				
				for(int i=0;i<a.length();i++)
				{
				//	System.out.println(a.charAt(i));
				//	System.out.println(temp_a);
					temp_a^=a.charAt(i);
			//		 System.out.println(temp_a);
				}
				
			//	System.out.println("Second string starts from here");
				for(int j=0;j<b.length();j++)
				{
			//		System.out.println(b.charAt(j));
					temp_b^=b.charAt(j);
				}
				
				
			//	System.out.println(temp_a);
			//	System.out.println(temp_b);
				
				if((temp_a^temp_b)==0)
				{
					System.out.println("Strings are equal");
				}else {
					System.out.println("Strings are not equal");
				}
				
			}
}

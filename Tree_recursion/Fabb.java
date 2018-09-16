package Tree_recursion;

public class Fabb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Fabb().fib(10));
		char[] test = {'a','b','c','d','e','f'};
		new Fabb().reverse("Gaurav");
		int counter=0;
	}
	private int counter;
	public int fib(int a)
	{
		int temp =0;
		if(a==0 || a==1)
		{
			return a;
		}
		temp = fib(a-1) + fib(a-2);
		return temp;
		
	}
	void reverse(String str)
    {
		//int counter=0;
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
        	counter=counter+1;
        	System.out.println(counter);
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
 
        }}
}

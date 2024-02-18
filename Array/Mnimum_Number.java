package Array;

public class Mnimum_Number {
	public static void main(String[]arg)
	{
		int min = Integer.MAX_VALUE;
		
		int a[]= {102,30,2,3,1,50};
		
		for(int i=0;i<a.length;i++)
		{
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		System.out.println(min);
	}
}

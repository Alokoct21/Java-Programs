package Array;

public class Maximum_Number {
	public static void main(String[]args)
	{
		int max = Integer.MIN_VALUE;
		int a[] = {20,4,5,30,4,90,7,8};
		int l = a.length;
		
		for(int i=0;i<l;i++)
		{
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		
			System.out.println(max);
		
	}

}

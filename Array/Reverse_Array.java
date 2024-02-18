package Array;

public class Reverse_Array {
	
	public static void reverseArray(int n[],int l)
	{
		for(int i=0;i<l/2;i++)
		{
				int temp = n[i];
				n[i] = n[l-1-i];
				n[l-i-1] = temp;
			
		}
		
		for(int i=0;i<l;i++)
		{
			System.out.println(n[i]);
		}
		
		
	}
	
	public static void main(String[]args)
	{
		int a[] = {10,20,303,40,50};
		int l = a.length;
		
		reverseArray(a,l);
	}

}

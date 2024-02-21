package Array;

public class copyArray {
	
	public static void main(String[]args)
	{
		int a[] = {1,2,3,3,4,5,6};
		int l = a.length;
		int n[] = new int[l];
		
		for(int i=0;i<a.length;i++)
		{
			n[i] = a[i];
		}
		
		for(int j=0;j<n.length;j++)
		{
			System.out.print(n[j]+" ");
		}
	}

}

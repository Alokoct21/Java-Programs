package Array;

public class Decending_order {
	
	public static void decendingArray(int n[],int l) {
		
		// sort the  array
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(n[i]<n[j]) {
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
				
			}
		}
		
		for(int i=0;i<l;i++)
		{
			System.out.println(n[i]+" ");
		}
	}
	
	public static void main(String[]args)
	{
		int a[] = {10,20,30,40,50};
		
		int l = a.length;
		
		decendingArray(a,l);
	}

}

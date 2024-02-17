package Array;

public class Sort_Array {
	
	public static void sortArray(int n[],int l)
	{
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(n[i]>n[j])
				{
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
					
					
				}
			}
		}
		
		for(int i=0;i<l;i++)
		{
			System.out.println(n[i]);
		}
		
	}
	public static void main(String[]args)
	{
		int a[] = {20,30,50,10,5};
		int l = a.length;
		
		sortArray(a,l);
	}

}

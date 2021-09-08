import java.util.Arrays;

public class NegativeComeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= new int[] {3,6,3,2,-6,-4,6,-2,-5,7,5,9,-9};
		int temp=0;
		int j=0;
		
		try {
			
		
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<0)
			{
				temp=a[i];
				j=i-1;
				while(j>=0 && a[j]>0)
				{
					a[j+1]=a[j];
					j--;
					
				}
				a[j+1]=temp;
				
				
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int p=0;p<a.length;p++)
		{
			System.out.println(a[p]);
		}

	}

}

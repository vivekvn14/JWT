
public class ProgramForFibonaaci {
	public static void main(String[] args) {
		
		
		int n=7;
		int tem=1;
		int result=0;
		int n1;
		
		System.out.print(result+" "+tem);
		for(int i=2;i<n;i++)
		{
			n1=tem+result;
			System.out.print(""+n1);
			result=tem;
			tem=n1;
		}
	}

}

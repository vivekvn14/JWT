
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=786;
		int temp;
		int reverse=0;
		while(a>0)
		{
		temp=a%10;
		reverse=reverse*10+temp;
		a=a/10;
		}
		
		System.out.println(reverse);
		

	}

}

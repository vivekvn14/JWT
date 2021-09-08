
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my.name.is.vivek.nautiyal";
		
		String[] str=s.split("\\.");
		String output="";
		System.out.println(str.length);
		for(int i=str.length-1;i>0;i--)
		{
			System.out.println(str[i]);
			output=output+str[i]+".";
		}
		output=output+str[0];
		System.out.println(output);
		
		

	}

}

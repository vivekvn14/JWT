
public class MinnorChangeInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "pneumonia";
		String reverse="zyxwvutsrqponmlkjihgfedcba";
		int p=4;
		
		int n=s.length();
		int m=reverse.length();
		String answer="";
		
		
//		System.out.println('p'-'a');
		
//		for(int i=0;i<n;i++)
//				{
////			System.out.println(s.charAt(i));
//				System.out.println(s.charAt(i)-'a');
//				}
//		
		
		for(int i=0;i<3;i++)
		{
			
			answer=answer+s.charAt(i);
		}
		System.out.println("Answer string "+answer);
		for (int i = 3; i < n; i++)
            System.out.println(answer = answer + reverse.charAt(s.charAt(i) - 'a'));
        System.out.println(answer);

	}

}

import java.util.Stack;

public class StackCheck {
	
	public static void main(String[] args)
	{
	
		Stack<Integer> st= new Stack<>();
		
		st.push(2);
		st.push(8);
		st.pop();
		st.push(5);
		st.push(5);
		st.pop();
		st.pop();
		st.pop();
		st.push(1);
		st.pop();
	System.out.println(st);
	}
	

}

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindLargestSmallestInArray {
	
	public static void main(String[] args) {
		
		int [] a= new int[] {3,6,3,1,5,7,2,5,8,1,9,4};
		
		Queue<Integer> qu = new PriorityQueue<>();
		
		
//		qu.add(2);
//		qu.add(4);
//		qu.add(1);
//		qu.add(5);
//		qu.add(8);
//		qu.add(6);
		
		for(int i=0;i<a.length;i++)
		{
			qu.add(a[i]);
		}
		System.out.println(qu);
		System.out.println("The smallest is : "+ qu.peek());
		
	}

}

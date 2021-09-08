import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDeuplicateIntegerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= new int[] {1,3,6,3,4,6,3,5,6,1,8,};
		Set<Integer> set  = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer q:set)
		{
			System.out.println(q);
		}

	}

}

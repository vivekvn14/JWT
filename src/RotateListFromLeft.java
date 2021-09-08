import java.util.ArrayList;
import java.util.List;

public class RotateListFromLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst= new ArrayList<>();
		List<Integer> result= new ArrayList<>();
		
		lst.add(2);
		lst.add(1);
		lst.add(5);
		lst.add(3);
		lst.add(6);
		
		int n=4;
		
		result=rotateList(lst,n);
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
		

	}

	private static List<Integer>rotateList(List<Integer> lst, int n) {
		
		// TODO Auto-generated method stub
		int temp=0;
		
		
		for(int i=0;i<n;i++)
		{
			temp=lst.get(0);
			for(int j=1;j<lst.size();j++)
			{
				
				lst.set(j-1, lst.get(j));
			}
			lst.set(lst.size()-1, temp);
			
		}
		
	    
	    return lst;

	    }
		
	}



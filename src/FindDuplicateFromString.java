import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "geeksforgeeks";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(!map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),1);
			}
			else
			{
				System.out.println(map.get(s.charAt(i)));
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		for (Map.Entry mapElement : map.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key
                                   + ", count = " + value);
        }
		
	}

}

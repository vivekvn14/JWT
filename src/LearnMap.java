import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map= new LinkedHashMap<>();
		
		map.put("a",	 new Integer(100));
		map.put("b", 200);
		map.put("c", 300);
		map.put("d",400);
		
		System.out.println(map);
		
		for(Map.Entry<String	, Integer> me:map.entrySet())
		{
			System.out.println(me.getValue());
		}
		map.clear();
		System.out.println(map);
	}

}

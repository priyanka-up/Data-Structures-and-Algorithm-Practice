package hashing;

//create a reverse map of given map.
//treverse original map and see is corresponding key exists in reverse map
//if it does not exist then we found our starting point
//after found starting point simply trace the complete path from original map



import java.util.HashMap;
import java.util.Map;

public class CheckPath {
	
	public static String findPath(Map<String,String> map)
	{
		String result= "";
		HashMap<String,String> reverseMap = new HashMap<String,String>();
		
		//to fill reversemap iterate through the given map
		//Map.entrySet() method returns a collection-view(Set<Map.Entry<K, V>>) of the mappings contained in this map.
		//So we can iterate over key-value pair using getKey() and getValue() methods of Map.Entry<K, V>. 
		
		for(Map.Entry<String,String> entry: map.entrySet())
		{
			reverseMap.put(entry.getValue(), entry.getKey());
		}
		
		//find the starting point
		String from = "";
		int count = 0;
		
		//check that key is present in reverse graph
		for(Map.Entry<String, String> entry: map.entrySet())
		{
			if(!reverseMap.containsKey(entry.getKey()))
			{
				count++;
			    from = entry.getKey();
			    //System.out.println(from);
			}
			
		}
		if(count>1)
			return null;
		
		String to = map.get(from);
		
		while(to != null)
		{
			result = result + from + "->" + to +",";
			from = to;
			to = map.get(to);
		}
		return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("newyork", "chicago");
		hmap.put("boston", "texas");
		hmap.put("missouri", "newyork");
		hmap.put("texas", "missouri");
		
		String actual_path = CheckPath.findPath(hmap);
		System.out.println(actual_path);
	}

}

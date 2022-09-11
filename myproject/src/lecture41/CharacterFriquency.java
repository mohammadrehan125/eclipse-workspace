package lecture41;

import java.util.HashMap;
import java.util.TreeMap;

public class CharacterFriquency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		//           OR
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();

		String str = "aaabbbcccdddeeefghh";
		

		for(int i = 0; i < str.length(); i++)
		{
		char ch = str.charAt(i);
		map.put(ch, map.getOrDefault(ch,0)+1);
//		if(map.containsKey(ch))
//		{
//			map.put(ch, map.get(ch)+1);
//		}
//		else
//		{
//			map.put(ch, 1);
//		}
		}
		System.out.println(map);

		for(char key : map.keySet())
		{
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		
		
		
		
		
		
	}

}

package interview.question.programs;

import java.util.Map;
import java.util.TreeMap;

public class FindFrequencyOfChar {

	public static void main(String[] args) {
		String str="omveerjhjdghjdgkdjgkd";
		Map<Character,Integer> map=new TreeMap<>();
		for(Character ch:str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 1)+1);
		}
		
		System.out.println(map);
	}
}

package interview.question.programs;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,5,1,1,3,};
		Map<Integer,Integer> map=new HashMap<>();
		
		for(Integer num:arr)
			map.put(num,map.getOrDefault(num,0)+1);
		
		boolean isAnynonRepeating=false;
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non repeating element is : "+entry.getKey());
				isAnynonRepeating=true;
				break;
			}
		}
		
		if(!isAnynonRepeating) {
			System.out.println("-1");
		}
			
		//Arrays.stream(arr).collect(Collectors.groupingBy())
		
	}
}

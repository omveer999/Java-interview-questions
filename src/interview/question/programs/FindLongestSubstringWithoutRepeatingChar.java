package interview.question.programs;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubstringWithoutRepeatingChar {

	public static void main(String [] args) {
		String str="abcabcdbb";
		int start=0;
		int end=0;
		int maxLength=0;
		Set<Character> charSet=new HashSet<>();
		
		while(end<str.length()) {
			char currentChar=str.charAt(end);
			if(!charSet.contains(currentChar)) {
				charSet.add(currentChar);
				end++;
				maxLength=Math.max(maxLength, end-start);
			}else {
				charSet.remove(str.charAt(start));
				start++;
			}
		}
//		System.out.println(start+"=="+end+"=="+maxLength);
	System.out.println("Length of Longest substring is : "+maxLength);
	}
}

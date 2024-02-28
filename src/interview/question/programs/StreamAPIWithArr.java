package interview.question.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Stream always work on objects and wrapper not on primitive data type
public class StreamAPIWithArr {

	public static void main(String[] args) {
		Integer[] arr= {19,20,20,30,4,4,5,60,7,8};
		
		
		
		 System.out.println("Max number : "+ Arrays.stream(arr).max(Integer::compare).get());
		 System.out.println("Min number : "+ Arrays.stream(arr).min(Integer::compare).get());
		 
		 //FindAny vs Findfirst 
		 //Findfirst return the first element of stream 
		 //FindAny return most probally the first element but does not gurantee
		 System.out.println("Find any number : "+ Arrays.stream(arr).findAny().get());
		 System.out.println("Find first number : "+ Arrays.stream(arr).findFirst().get());
		 
		 //Print the square of all number using stream
		 Function<Integer, Integer> squareFunction=n->n*n;
		 List<Integer> squareNum= Arrays.stream(arr).map(squareFunction).collect(Collectors.toList());
		 System.out.println("Square of number : "+squareNum);
		 
		 		 
		 //Find the even number from arrayy
		 Predicate<Integer> evenPredicate=n->n%2==0;
		 List<Integer>evenList= Arrays.stream(arr).filter(evenPredicate).collect(Collectors.toList());
		 System.out.println("List of Even number"+evenList);
		 
		 //Find the sum of array
		 int sum=Arrays.stream(arr).reduce(0,(n1,n2)->n1+n2);
		System.out.println("sum of all number : "+sum);
		
		//Prints distinct number of list
		List<Integer> distinctList= Arrays.stream(arr).distinct().collect(Collectors.toList());
		System.out.println("Distinct List of Numbers : "+distinctList);
		
		
		List<String> listOfWords=Arrays.asList("ram","is","good","boy");
		
		//Print all the character of each word as list 
		List<String> allChar=listOfWords.stream().flatMap(word->Arrays.stream(word.split(""))).collect(Collectors.toList());
		System.out.println("All charactors of word as list : "+allChar);
		
		//Make the group of words using length 
		Map<Integer, List<String>> lenOfWOrds=listOfWords.stream().collect(Collectors.groupingBy(s->s.length()));
		System.out.println(lenOfWOrds);
		
		
		
	}
}

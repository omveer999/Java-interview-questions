package interview.question.programs;

import java.util.Arrays;

/**
 * Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
 *
 *Note: There are no duplicates in the list.
 */
public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		Arrays.sort(arr);
		int n=arr.length+1;
		
		int missingIndex=0;
		//Approach 1
		for(int i=0;i<n-2;i++) {
			if(arr[i+1]!=arr[i]+1) {
				missingIndex=i;
				break;
			}
		}
		
		if(missingIndex!=0) {
			System.out.println("Approach 1 : Missing number is : "+(arr[missingIndex]+1));
		}else {
			System.out.println("Approach 1 : Missing number is : "+(arr[n-2]+1));	
		}
		
		//Approach 2 : sum(n)=n*(n+1)/2
		//missing num= total sum(n)-total sum of arr(n-1)
		
		int sumOfN=n*(n+1)/2;
		int arrsum=0;
		for(int i=0;i<n-1;i++) {
			arrsum+=arr[i];
		}
		System.out.println("Approach 2 : Missing number is : "+(sumOfN-arrsum));
		
	
	}
}

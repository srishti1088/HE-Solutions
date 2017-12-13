package hackerEarth.basics.inputOuput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * You have been given an array A of size N consisting of positive integers. 
 * You need to find and print the product of all the number in this array Modulo 10^9+7
 * 
 * Input Format: The first line contains a single integer N denoting the size of the array. 
 * The next line contains N space separated integers denoting the elements of the array.
 * 
 * Output Format: Print a single integer denoting the product of all the elements of the array Modulo 10^9+7
 * 
 * Constraints: 1<=N<=10^3
 * 1<=A[i]<=10^3
 * 
 * Explanation: There are 55 integers to multiply. 
 * Let's store the final answer in answer variable. 
 * Since 1 is identity value for multiplication, initialize answer as 1.  
 * So the process goes as follows:  
 * 
 * answer=1  
 * answer=(answer*1) % (10^9 + 7 ) 
 * answer=(answer*2) % (10^9 + 7 ) 
 * answer=(answer*3) % (10^9 + 7 ) 
 * answer=(answer*4) % (10^9 + 7 )
 * answer=(answer*5) % (10^9 + 7 )
 * 
 * The above process will yield answer as 120.
 */
public class HackerEarth_FindProduct {

	public static void main(String args[] ) throws Exception {

		List<Long> numbers = new ArrayList<Long>();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(s.hasNextLong()){
			numbers.add(s.nextLong());
		}
		s.close();
		System.out.println(findProduct(numbers, n));
		
	}

	private static long findProduct(List<Long> numbers, int n) {
		long answer=1;
		for(int i=0;i<n;i++){
			answer = (long) ((answer * numbers.get(i)) % (Math.pow(10, 9) +7));
		}
		return answer;
	}

}

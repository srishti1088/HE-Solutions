package hackerEarth.algorithms.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 Given A Series Of N Positive Integers a1,a2,a3........an. , 
 Find The Minimum And Maximum Values That Can Be Calculated By Summing Exactly N-1 Of The N Integers. 
 Then Print The Respective Minimum And Maximum Values As A Single Line Of Two Space-Separated Long Integers.

 Input Format

 First Line Take Input Value Of N

 Second Line Take Input N Space Separated Integer Value

 Output Format

 Two Space Separated Value ( One Maximum Sum And One Minimum Sum )

 Constraints

 0 < N < 100001
 0 <= ai < 10^13
 
 SAMPLE INPUT 
 5
 1 2 3 4 5
 
 SAMPLE OUTPUT 
 10 14
 
 Explanation
 Our initial numbers are 1,2,3,4 and 5. We can calculate the following sums using four of the five integers:

 If we sum everything except 1, our sum is 2+3+4+5=14 .
 If we sum everything except 2, our sum is 1+3+4+5=13 .
 If we sum everything except 3, our sum is 1+2+4+5=12 .
 If we sum everything except 4, our sum is 1+3+4+5=11 .
 If we sum everything except 5, our sum is 1+2+3+4=10 .
 
 As you can see, the minimal sum is 1+2+3+4=10 and the maximal sum is 2+3+4+5=14. Thus, we print these minimal and maximal sums as two space-separated integers on a new line.
*/
public class HackerEarth_MinMax {
	
	public static void main(String [] args) throws Exception{
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int[] input = new int[N];
		for(int i=0;i<N;i++){
			input[i] = s.nextInt();
		}
		
		//findMinMaxBySorting(N, input);
		
		//findMinMaxByLargestAndSmallestNum(N, input);
		
		s.close();
	}
	
	private static void findMinMaxByLargestAndSmallestNum(int N, int[] input){
		int largestNum=input[0];
		int smallestNum=input[0];
		
		for(int i=0;i<N;i++){
			if(input[i]>largestNum){
				largestNum=input[i];
			}
			if(input[i]<smallestNum){
				smallestNum=input[i];
			}
		}
		
		int sum=0;
		for(int i=0;i<N;i++){
			if(input[i] != largestNum && input[i] != smallestNum){
				sum+=input[i];
			}
		}
		
		int minSum = sum+smallestNum;
		int maxSum = sum+largestNum;
		
		System.out.println(minSum + " "+ maxSum);
	}

	private static void findMinMaxBySorting(int N, int [] input) {
//		int temp;
//		for (int i = 0; i < N; i++) 
//        {
//            for (int j = i + 1; j < N; j++) 
//            {
//                if (input[i] > input[j]) 
//                {
//                    temp = input[i];
//                    input[i] = input[j];
//                    input[j] = temp;
//                }
//            }
//        }
		
		Arrays.sort(input);
		
		int minSum = 0;
		for(int i=0;i<N-1;i++){
			minSum += input[i];
		}
		
		int maxSum = 0;
		for(int i=N-1;i>0;i--){
			maxSum += input[i];
		}
		
		System.out.println(minSum +" "+ maxSum);
		
	}
}

package hackerEarth.algorithms.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

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

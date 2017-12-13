package hackerEarth.algorithms.linearSearch;

import java.util.Scanner;

/*
 * Given a List of Distinct N number a1,a2,a3........an.
Find The Position Of Number K In The Given List.

Input Format

First Line Take Input Value Of N

Second Line Take Input N Space Separated Integer Value

Third Line Take Input Value Of K

Output Format

Position Of K In The Given List

Constraints

0 < N < 100001
0 < ai < 1010
0 < K < 1010
NOTE:
Array Indexing Starts From 0

SAMPLE INPUT 
5
1 2 3 4 5
4
SAMPLE OUTPUT 
3

 */
public class HackerEarth_SimpleSearch {
	
	public static void main(String args[] ) throws Exception {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int [] list = new int[N];
		
		for(int i=0;i<N;i++){
			list[i]=s.nextInt();
		}
		
		int K = s.nextInt();
		
		for(int i=0;i<N;i++){
			if(list[i]==K){
				System.out.println(i);
			}
		}
		s.close();
	}

}

package hackerEarth.basics.inputOuput;

import java.util.Scanner;

/*
 * You have been given 3 integers - l, r and k. 
 * Find how many numbers between l and r (both inclusive) are divisible by k. 
 * You do not need to print these numbers, you just have to find their count.
 * 
 * Input Format: The first and only line of input contains 3 space separated integers l, r and k.
 * 
 * Output Format: Print the required answer on a single line.
 * 
 * Constraints: 1<=l<=r<=1000
 * 1<=k<=1000
 */
public class HackerEarth_CountDivisors {
	
	public static void main(String args[]) throws Exception{
		
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int r = s.nextInt();
		int k = s.nextInt();
		
		System.out.println(countDivisors(l,r,k));
	}
	
	private static int countDivisors(int l, int r, int k){
		int count=0;
		for(int i=l;i<=r;i++){
			if(i%k==0){
				count++;
			}
		}
		return count;
	}
}

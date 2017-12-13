package hackerEarth.basics.inputOuput;

import java.util.Scanner;

/*
 * You are given an integer N. You need to print the series of all prime numbers till N.
 * 
 * Input Format: The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.
 * 
 * Output Format: Print the desired output in single line separated by spaces.
 * 
 * Constraints: 1<=N<=1000
 */
public class HackerEarth_PrimeNumbers {

	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=2;i<=N;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
	
	/**
     * Checks if a positive integer is a prime number
     */
	public static boolean isPrime(int num){
		for(int count=2;count<num;++count){
			if(num%count==0){
				return false;
			}
		}
		return true;
	}
}


package hackerEarth.basics.inputOuput;

import java.util.Scanner;

/*
 * You have been given a positive integer N.
 * You need to find and print the Factorial of this number. 
 * The Factorial of a positive integer N refers to the product of all number in the range from 1 to N.
 * You can read more about the factorial of a number here.
 * 
 * Input Format: The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.
 * 
 * Output Format: Output a single line denoting the factorial of the number N.
 * 
 * Constraints: 1<=N<=10
 */
public class HackerEarth_Factorial {
	public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int fac = factorial(n);
        
        System.out.println(fac);

    }
	
	private static int factorial(int n){
		if(n!=1){
			return n * factorial(n-1);
		}else{
			return 1;
		}
	}
}

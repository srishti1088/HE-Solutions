package hackerEarth.basics.inputOuput;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given two strings of equal length, you have to tell whether they both strings are identical.
 * 
 * Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. 
 * See Sample explanation for more details.
 * 
 * Input: First line, contains an intger 'T' denoting no. of test cases. 
 * Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
 * 
 * Output: For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO
 * 
 * Constraints: 
 * 1<= T <=100
 * 1<= |S1| = |S2| <= 10^5
 * String is made up of lower case letters only.
 * 
 * Note : Use Hashing Concept Only . Try to do it in O(string length) .
 */
public class HackerEarth_TwoStrings {

	static String a="";
	static String b="";
	static char[] A=new char[a.length()];
	static char[] B=new char[b.length()];

	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for(int i=0;i<n;i++){
			a = s.next();
			b = s.next();
			a.toLowerCase();
			b.toLowerCase();

			String output = compare(a,b)? "YES" : "NO";

			System.out.println(output);
		}

	}

	private static boolean compare(String a, String b){

		A = a.toCharArray();
		B = b.toCharArray();

		Arrays.sort(A);
		Arrays.sort(B);

		if(Arrays.equals(A, B)){
			return true;
		}else{
			return false;
		}
	}

}

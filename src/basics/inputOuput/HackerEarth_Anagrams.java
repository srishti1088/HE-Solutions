package hackerEarth.basics.inputOuput;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams.
 * Any characters can be deleted from either of the strings.
 * 
 * Input : test cases,t
 * two strings a and b, for each test case
 * 
 * Output: Desired O/P
 * 
 * Constraints : string lengths<=10000
 * 
 * Note : Anagram of a word is formed by rearranging the letters of the word.
 * For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
 */
public class HackerEarth_Anagrams {

	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++){
			String a = s.next();
			String b = s.next();

			System.out.println(anagrams(a,b));
		}
	}

	private static int anagrams(String a, String b){
		int count=0;

		a.toLowerCase();
		b.toLowerCase();

		int lenA=a.length();
		int lenB=b.length();

		char[] A = a.toCharArray();
		char[] B = b.toCharArray();

		Arrays.sort(A);
		Arrays.sort(B);

		int i=0, j=0;

		while(i < lenA && j < lenB){
			if(A[i] < B[j]){
				count++;
				i++;
			}
			else if(A[i] > B[j]){
				count++;
				j++;
			}
			else{
				i++;
				j++;
			}
		}

		if( i < lenA)
			count += lenA - i;
		else
			count += lenB - j;
		return count;

	}
}



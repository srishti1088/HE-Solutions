package hackerEarth.basics.inputOuput;

import java.util.Scanner;
/*
 * You have been given a String S consisting of uppercase and lowercase English alphabets. 
 * You need to change the case of each alphabet in this String. 
 * That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. 
 * You need to then print the resultant String to output.
 * 
 * Input Format: The first and only line of input contains the String S
 * 
 * Output Format: Print the resultant String on a single line.
 * 
 * Constraints: 1<=|S|<=100 where |S| denotes the length of string S.
 */
public class HackerEarth_ToggleString {
	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);
		char[] a=s.next().toCharArray();

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=97 && a[i]<=122)
			{
				a[i]-=32;
			}
			else
			{
				a[i]+=32;
			}
		}
		for(char ch:a)
		{
			System.out.print(ch);
		}
		s.close();
	}

}

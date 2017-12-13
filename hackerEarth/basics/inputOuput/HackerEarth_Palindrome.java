package hackerEarth.basics.inputOuput;

import java.util.*;

/*
 * You have been given a String S. You need to find and print whether this string is a palindrome or not. 
 * If yes, print "YES" (without quotes), else print "NO" (without quotes).
 * 
 * Input Format: The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.
 * 
 * Output Format: Print the required answer on a single line.
 * 
 * Constraints: 1<=|S|<=100 where |S| denotes the length of string S.
 * 
 * Note: String S consists of lowercase English Alphabets only.
 * 
 * 
 */
class HackerEarth_Palindrome {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        char[] input=s.next().toCharArray();
        
        System.out.println(isPalindrome(input) ? "YES" : "NO");
        
        s.close();
    }

    /**
     * Checks if an array is a Palindrome
     */
	private static boolean isPalindrome(char[] input) {

		int startIndex=0;
        int lastIndex=input.length-1;
        while(lastIndex>startIndex)
        {
            if(input[startIndex]!=input[lastIndex])
                return false;
            ++startIndex;
            --lastIndex;
        }
        return true;
	}
}

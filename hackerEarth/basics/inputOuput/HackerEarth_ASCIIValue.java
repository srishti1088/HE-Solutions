package hackerEarth.basics.inputOuput;

import java.util.Scanner;

/*
 * Given a character C, print the ASCII value of that character.
 * 
 * Input: First and only line in input contains a character C.
 * 
 * Output: Print the ASCII value of the character C.
 * 
 * Constraints: C belongs to ASCII characters
 */
public class HackerEarth_ASCIIValue {

	    public static void main(String args[] ) throws Exception {

	        Scanner s = new Scanner(System.in);
	        char n = s.next().charAt(0);
	        
	        System.out.println((int)n);
	    }
	}



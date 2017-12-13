package hackerEarth.algorithms.linearSearch;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Today, Monk went for a walk in a garden. 
 * There are many trees in the garden and each tree has an English alphabet on it. 
 * While Monk was walking, he noticed that all trees with vowels on it are not in good state. 
 * He decided to take care of them. So, he asked you to tell him the count of such trees in the garden. 
 * Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.
 * 
 * Input: The first line consists of an integer T denoting the number of test cases.
 * Each test case consists of only one string, each character of string denoting the alphabet (may be lowercase or uppercase) on a tree in the garden.
 * 
 * Output: For each test case, print the count in a new line.
 * 
 * Constraints: 1 <= T <= 10
 * 1 <= length of string <= 10^5
 * 
 * SAMPLE INPUT 
 * 2
 * nBBZLaosnm
 * JHkIsnZtTL
 * 
 * SAMPLE OUTPUT
 * 2
 * 1
 * 
 * Explanation
 * 
 * In test case 1, a and o are the only vowels. So, count=2
*/
public class HackerEarth_MonkTakesAWalk {
	
	public static void main(String args[] ) throws Exception {
		
		List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
		
		int count =0;
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=0;i<num;i++){
			String sample = s.next();
			for(int j=0; j<sample.length();j++){
				if(vowels.contains(sample.charAt(j))){
					count++;
				}
			}
			System.out.println(count);
			count=0;
		}
	
		s.close();
	}   

}

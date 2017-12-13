package hackerEarth.basics.inputOuput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. 
 * More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. 
 * All numbers at input are integers of one or two digits.
 * 
 * SAMPLE INPUT 
 * 1
 * 2
 * 88
 * 42
 * 99
 * SAMPLE OUTPUT 
 * 1
 * 2
 * 88
 */
public class HackerEarth_LifeUniverseAndEverything {

	public static void main(String args[] ) throws Exception {

		int fortyTwo = 42;
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextInt()){
			list.add(s.nextInt());
		}
		
		for(int i=0;i<list.size();i++){
			int num = list.get(i);
			if(num!=fortyTwo){
				System.out.println(num);
			}else{
				break;
			}
		}
		
		s.close();
	}

}

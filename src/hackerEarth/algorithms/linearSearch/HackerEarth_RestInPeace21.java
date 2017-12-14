package hackerEarth.algorithms.linearSearch;

import java.util.Scanner;

/*The grandest stage of all, Wrestlemania XXX recently happened. And with it, happened one of the biggest heartbreaks for the WWE fans around the world. The Undertaker's undefeated streak was finally over.

Now as an Undertaker fan, you're disappointed, disheartened and shattered to pieces. And Little Jhool doesn't want to upset you in any way possible. (After all you are his only friend, true friend!) Little Jhool knows that you're still sensitive to the loss, so he decides to help you out.

Every time you come across a number, Little Jhool carefully manipulates it. He doesn't want you to face numbers which have "21" as a part of them. Or, in the worst case possible, are divisible by 21.

If you end up facing such a number you feel sad... and no one wants that - because you start chanting "The streak is broken!" , if the number doesn't make you feel sad, you say, "The streak lives still in our heart!"

Help Little Jhool so that he can help you!

Input Format:
The first line contains a number, t, denoting the number of test cases.
After that, for t lines there is one number in every line.

Output Format:
Print the required string, depending on how the number will make you feel.

Constraints:
1 <= t <= 100
1 <= n <= 1000000*/
public class HackerEarth_RestInPeace21 {
	
	public static final String HAPPY="The streak lives still in our heart!";
	
	public static final String SAD="The streak is broken!";

	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=0;i<num;i++){
			
			howYouFeel(s.nextInt());
		}
		
		s.close();

	}

	private static void howYouFeel(int nextInt) {
		if(nextInt%21==0 || String.valueOf(nextInt).contains("21")){
			System.out.println(SAD);
		}else{
			System.out.println(HAPPY);
		}
		
	}
}

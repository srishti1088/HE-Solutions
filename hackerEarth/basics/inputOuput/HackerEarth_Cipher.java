package hackerEarth.basics.inputOuput;

import java.util.Scanner;

/*
 * Indian army is going to do a surprise attack on one of its enemies country. 
 * The President of India, the Supreme Commander of the Indian Army will be sending an alert message to all its commanding centers. 
 * As enemy would be monitoring the message, Indian army is going to encrypt(cipher) the message using basic encryption technique. 
 * A decoding key 'K' (number) would be sent secretly.
 * 
 * You are assigned to develop a cipher program to encrypt the message. 
 * Your cipher must rotate every character in the message by a fixed number making it unreadable by enemies.
 * 
 * Given a single line of string 'S' containing alpha, numeric and symbols, followed by a number '0<=N<=1000'. 
 * Encrypt and print the resulting string.
 * 
 * Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, remain unencrypted.
 */
public class HackerEarth_Cipher {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int key = s.nextInt();
		
		int length = input.length();
		
		for(int i=0;i<length;i++){
			char c = input.charAt(i);
			
			//ASCII of a = 97 and z = 122
			if(c<='z' && c>='a'){
				System.out.print((char)(((((c+key)-97)%26) + 97)));
			
			//ASCII of 0 = 48 and 9 = 57
			}else if(c<='9' && c>='0'){
				System.out.print((char) (((((c+key)-48)%10) + 48)));
				
			//ASCII of A = 65 and Z = 90
			}else if(c<='Z' && c>='A'){
				System.out.print((char) (((((c+key)-65)%26) + 65)));
				
			}else {
				System.out.print(c);
			}
			
		}
	}
}

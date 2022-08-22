package exercises;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a word to see if its palindrome!");
		String sentence = scnr.nextLine();
		String rev = "";
		for(int i = sentence.length()-1; i >= 0; i--) {
			rev = rev + sentence.charAt(i);
		}
		if(sentence.equalsIgnoreCase(rev)) {
			System.out.println("Yes, this is a Palindome!");
		}
		else {
			System.out.println("No, this is not a Palindome!");
		}
	}

}

package exercises;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello please enter a sentence so I can count the vowels!");
		Scanner scnr = new Scanner(System.in);
		String sentence = scnr.nextLine();
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			sentence = sentence.toUpperCase();
			if(sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println("Your sentence has " + count + " vowels in it!");
	}

}
 
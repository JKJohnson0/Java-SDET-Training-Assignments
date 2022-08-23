package exercises;
import java.util.*;
public class transverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello! Please enter a word with repeating characters!");
		String sentence = scnr.nextLine();
		String newWord = "";
		for(int i =0; i < sentence.length(); i++) {
			for(int k = i + 1; k < sentence.length(); k++) {
				if(sentence.charAt(i) == sentence.charAt(k)) {
					newWord = newWord + sentence.charAt(i);
				}
			}
		}
		System.out.println(newWord);

	}

}
package exercises;
import java.util.*;
public class consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! Enter a sentence so I can count the consonants!");
		Scanner scnr = new Scanner(System.in);
		String sentence = scnr.nextLine();
		StringBuilder newSentence = new StringBuilder(sentence);
		int count = 0;
		
		for(int i = 0; i < newSentence.length(); i++) {
			char cont = newSentence.charAt(i);
			if(cont == 'a' || cont == 'e' || cont == 'i' || cont == 'o' || cont == 'u') {
				System.out.print("");
			}
			else if(cont != ' ') {
				newSentence.setCharAt(i, '*');
				count++;
			}
		}
		System.out.println("This is how many consonants you have : " + count);
		System.out.println("This is your new sentence");
		System.out.println(newSentence);
	}

}

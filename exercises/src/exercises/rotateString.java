package exercises;
import java.util.*;
public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello! Please enter a word you want to switch!");
		String word = scnr.nextLine();
		System.out.println("Please select a count of characters");
		int count = scnr.nextInt();
		String first = word.substring(0, count);
		String second = word.substring(count, word.length());
		System.out.println("This is your word flipped : " + second + first);
	}

}

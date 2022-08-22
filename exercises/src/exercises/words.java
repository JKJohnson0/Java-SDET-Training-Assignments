package exercises;

import java.util.Scanner;

public class words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! Please enter a sentence so I can count the words!");
		Scanner scnr = new Scanner(System.in);
		String sentence = scnr.nextLine();
		String[] sentenceCount = sentence.split(" ");
		int count = 0;
		for(String i: sentenceCount) {
			//System.out.println(i);
			++count;
		}
		System.out.println("This is how many words you have! :" + count);
	}

}

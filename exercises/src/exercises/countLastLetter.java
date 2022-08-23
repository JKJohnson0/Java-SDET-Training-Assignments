package exercises;
import java.util.*;
public class countLastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countY = 0;
		int countS = 0;
		int indexY = 0;
		int indexS= 0;
		System.out.println("Hello! Please enter a sentence!");
		Scanner scnr = new Scanner(System.in);
		String sentence = scnr.nextLine();
		scnr.close();
		ArrayList<String> sentencearry = new ArrayList<String>();
		String[] sentenceSplit = sentence.split(" ");
		//sentenceSplit = sentence.split(" ");
		//Arrays.asList(sentenceSplit);
		for(String word : sentenceSplit) {
			sentencearry.add(word);
			//System.out.println(word);
			//only has two variables in the array according to println
		}
		
		for(String word2: sentencearry) {
			if(word2.endsWith("y")) {
				countY++;
				if(word2.endsWith("y") && countY == 1) {
					indexY = sentencearry.indexOf(word2);
				}
			}
			if(word2.endsWith("s")) {
				countS++;
				if(word2.endsWith("s") && countS == 1) {
					indexS = sentencearry.indexOf(word2);
				}
			}
			//Collections.swap(sentencearry, indexY, indexS);
			for(String words2: sentencearry) {
				System.out.println(words2);
				//keeps doubling the output for some reason at this point
			}
		}
	}

}

package exercises;
import java.util.*;
public class Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {10, 10, 5, 12, 3, 5};
		ArrayList<Integer> newList = new ArrayList<Integer>();
		ArrayList<Integer> newCount = new ArrayList<Integer>();
		for(int i = 0; i < list.length; i++) {
			int count = 0;
			if(list[i] == list[i] + 1) {
				count++;
				newList.add(list[i]);
				newCount.add(count);
				
			}
		}
		for(int j = 0; j < newList.size(); ++j) {
		System.out.print(newList);
		System.out.print(newCount);
		}
	}

}

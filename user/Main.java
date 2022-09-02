package user;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Collection<User> u = new ArrayList<User>();
		User user = new User(null, 0);

		int num;
		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. UPDATE");
			System.out.println("0. EXIT");
			System.out.print("What is your choice : ");
			num = s.nextInt();

			switch(num) {
			case 1:
				System.out.print("Enter name : ");
				String n = s.nextLine();
				System.out.println("Enter age : ");
				int a = s.nextInt();
				u.add(new User(n,a));
				break;
				
			case 2:
				System.out.println(u);
			break;
			}

		}while(num!= 0);

	}

}

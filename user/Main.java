package user;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
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
				s.nextLine();
				String n = s.next();
				System.out.print("Enter age : ");
				int a = i.nextInt();
				u.add(new User(n,a));
				break;
				
			case 2:
				Iterator<User> it = u.iterator();
				while(it.hasNext()) {
					User use = it.next();
					System.out.println(use);
				}
			break;
			
			case 3:
				boolean found = false;
				System.out.print("Enter name to search : ");
				s.nextLine();
				n = s.nextLine();
				it = u.iterator();
				while(it.hasNext()) {
					User use = it.next();
					if(use.getName() == n){
						System.out.println(use);
					}
				}
				break;
			case 4:
				break;
			case 5:
				break;
			}

		}while(num!= 0);

	}

}

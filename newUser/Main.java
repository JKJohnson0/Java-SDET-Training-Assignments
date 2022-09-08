package newUser;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userobject user = new Userobject(null, null, null, null, null, 0);
		CollectUserInfo collect = new CollectUserInfo();
		UserDao dao = new UserDao();

		try(Scanner s = new Scanner(System.in);){
			
			boolean isRunning = true;
			
			while(isRunning) {
				System.out.println("Enter a choice.");
				System.out.println("1. Insert");
				System.out.println("2. Select all");
				System.out.println("3. Update");
				System.out.println("4. Delete");
				System.out.println("5. Quit");

				int choice = Integer.parseInt(s.nextLine());
				switch(choice) {
				case 1:
					user.setFirstName(collect.collectFirstName());
					user.setLastName(collect.collectLastName());
					user.setPhoneNumber(collect.collectPhoneNumber());
					user.setEmail(collect.collectEmail());
					user.setUserName(collect.collectUserName());
					user.setAge(collect.collectAge());
					dao.insertSQL(user);
					break;
				case 2:
					dao.seeAllSQL();
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.println("Closing application.");
					isRunning = false;
					break;
				default:
					System.out.println("Incorrect choice.");
					break;
				}
			}
		}

	}

}

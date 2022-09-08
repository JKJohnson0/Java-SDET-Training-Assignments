package newUser;
import java.util.*;

public class CollectUserInfo {
	Scanner s = new Scanner(System.in);
	Userobject user = new Userobject(null, null, null, null, null, 0);

	public String collectFirstName() {
		String firstName;
		do {
			System.out.print("Please enter your first name : ");
			firstName = s.nextLine();
			if(firstName.length() == 24 || firstName.length() == 0) {
				System.out.println("Name is out of range.");
				firstName = null;
			}
		}while(firstName == null);
		return firstName;
	}

	public String collectLastName() {
		String lastName;
		do {
			System.out.print("Please enter your last name : ");
			lastName = s.nextLine();
			if(lastName.length() == 24 || lastName.length() == 0) {
				System.out.println("Name is out of range.");
				lastName = null;
			}
		}while(lastName == null);
		return lastName;
	}

	public String collectPhoneNumber() {
		String phoneNumber;
		do {
			System.out.print("Please enter a 10 digit phonenumber : ");
			phoneNumber = s.nextLine();
			if(phoneNumber.length() > 10 || phoneNumber.length() < 10) {
				System.out.println("Sorry that's not a valid phonenumber.");
				phoneNumber = null;
			}
		}while(phoneNumber == null);
		return phoneNumber;
	}

	public String collectEmail() {
		String email;
		do {
			System.out.print("Please enter your email : ");
			email = s.nextLine();
		}while(email == null);
		return email;
	}

	public String collectUserName() {
		String userName;
		do {
			System.out.print("Please enter a username : ");
			userName = s.nextLine();
		}while(userName == null);
		return userName;
	}
	
	public int collectAge() {
		int age;
		do {
			System.out.print("Please enter your age : ");
			age = s.nextInt();
			if(age < 18) {
				System.out.println("Sorry you're to young to sign up.");
				age = -1;
			}
			if(age > 110) {
				System.out.println("Age out of range.");
				age = -1;
			}
		}while(age == -1);
		return age;
	}
}
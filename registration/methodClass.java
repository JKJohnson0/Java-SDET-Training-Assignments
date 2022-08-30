package registration;
import java.util.Scanner;
public class methodClass {

	Scanner scnr = new Scanner(System.in);

	public String firstName(){
		String firstName = null;

		do {
			System.out.println("Enter your first name.");
			firstName = scnr.nextLine();
			if(firstName.length() > 24) {
				firstName = null;
				System.out.println("Your name is too long!");
			}
		}
		while(firstName == null);

		return firstName;
	}

	public String lastName() {
		String lastName = null;

		do {
			System.out.println("Enter your last name.");
			lastName = scnr.nextLine();
			if(lastName.length() > 24) {
				lastName = null;
				System.out.println("Your name is too long!");
			}

		}
		while(lastName == null);

		return lastName;
	}

	public String phoneNumber() {
		String phoneNumber = null;
		do {
			System.out.println("Enter your phone number.");
			phoneNumber = scnr.nextLine();
			if(phoneNumber.length() > 10 && phoneNumber.length() < 10) {
				System.out.println("Please enter a valid phone number.");
				phoneNumber = null;
			}
		}while(phoneNumber == null);

		return phoneNumber;
	}

	public String email() {
		String email = null;

		System.out.println("Enter your email.");
		email = scnr.nextLine();

		return email;
	}

	public String userName() {
		String userName = null;

		System.out.println("Enter a username.");
		userName = scnr.nextLine();

		return userName;
	}

	public int age() {
		int age = -1;

		do {
			System.out.println("Enter your age.");
			age = scnr.nextInt();
			if(age < 18 || age > 110) {
				System.out.println("Your age is out of range.");
				age = -1;
			}
		}while(age == -1);

		return age;
	}
}

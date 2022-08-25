package exercises;
import java.util.*;
public class Registration {
	
	private String firstName = null;
	private String lastName = null;
	private int phoneNumber = -1;
	private String email = null;
	private String userName = null;
	private int age = -1;
	Scanner scnr = new Scanner(System.in);
	
	public Registration(String firstName, String lastName, int phoneNumber, String email, String userName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.age = age;
		
	}
	
	String email() {
		System.out.println("Enter your email.");
		email = scnr.nextLine();
		return email;
	}
	
	
	String userName() {
		System.out.println("Type a username.");
		userName = scnr.nextLine();
		if(userName.length() < 8) {
			System.out.println("Needs to be longer.");
		}
		if(userName.length() > 24) {
			System.out.println("Needs to be shorter.");
		}
		return userName;
	}
	
	int age() {
		System.out.println("Please enter your age!");
		age = scnr.nextInt();
		if(age < 18) {
			System.out.println("Sorry, you're to young to sign up.");
		}
		if(age > 111) {
			System.out.println("Age out of bounds.");
		}
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}
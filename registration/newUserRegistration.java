package registration;
import java.util.Scanner;

class newUserRegistration {
	Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newUserCreation user = new newUserCreation(null, null, null, null, null, 0);
		methodClass method = new methodClass();
		NewUserDAO dao = new NewUserDAO();
		//first name
		user.setFirstName(method.firstName());
		//System.out.println(user.getFirstName());
		//last name
		user.setLastName(method.lastName());
		//phonenumber
		user.setPhoneNumber(method.phoneNumber());
		//email
		user.setEmail(method.email());
		//username
		user.setUserName(method.userName());
		//age
		user.setAge(method.age());
		
		dao.sqlInsert(user);
		dao.sqlSearch();
		
	}

}

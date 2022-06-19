package laboops1.assigment;
import java.util.Scanner;

public class Employees{
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		String firstName;
		String lastName;
		String email;
		int option;
		System.out.println("Enter Your First Name");
		firstName= sc.next();
		System.out.println("Enter Your Last name");
		lastName=sc.next();
		email=firstName+lastName;
		System.out.println("Plese Select the Department from the following");
		System.out.println("1.Technical Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Human Resource Department");
		System.out.println("4.Legal Department");
		option=sc.nextInt();
		Credentials cred=new Credentials();
		switch(option) {
		case 1:
			System.out.println("Welcom To Technical Department");
			String depart="tech";
			System.out.println("Your Email   ---->"+email+"@tech.greatlearning.com");
			System.out.println("Password--->"+String.valueOf(cred.generatePassword(8)));
			break;
		case 2:
			System.out.println("Welcome To Admin Department");
			System.out.println("Your Email   ----->"+email+"@admin.greatlearing.com");
			System.out.println("Password--->"+String.valueOf(cred.generatePassword(8)));
			break;
		case 3:
			System.out.println("Welcome To Human Resource Department");
			System.out.println("Your Email   ----->"+email+"@humanresourse.greatlaering.com");
			System.out.println("Password--->"+String.valueOf(cred.generatePassword(8)));
			break;
		case 4:
			System.out.println("Welcom To Legal Department");
			System.out.println("Your Email   ---->"+email+"@legal.greatelearning.com");
			System.out.println("Password--->"+String.valueOf(cred.generatePassword(8)));
			break;
		}
	}
}
	



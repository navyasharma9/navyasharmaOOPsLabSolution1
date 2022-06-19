package com.gl.lab;
import java.util.Random;
import com.gl.lab.Employee;
public class Credential {
	public static void main(String[] args) {
		System.out.println(generatePassword(8));
	}
	public static char[] generatePassword(int length){
		String capitalCaseLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetter="abcdefghijklmnopqrstuvwxyz";
		String specialCharacter="!@#$";
		String number="1234567890";
		String combinedChars=capitalCaseLetter+lowerCaseLetter+specialCharacter+number;
		Random random= new Random();
		char[] password= new char[length];
		password[0]=number.charAt(random.nextInt(number.length()));
		password[1]=capitalCaseLetter.charAt(random.nextInt(capitalCaseLetter.length()));
		password[2]=lowerCaseLetter.charAt(random.nextInt(lowerCaseLetter.length()));
		password[3]=specialCharacter.charAt(random.nextInt(specialCharacter.length()));
		for(int i=4;i<length;i++) {
			password[i]=combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}
	public String generateEmailAddress(Employee employee) {
			String company=".greatelearning.com";
			String email=employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+company;
			employee.setEmail(email);
			return email;
	}
	public void showCredential(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows:");
		System.out.print(employee.getEmail());
	}
}


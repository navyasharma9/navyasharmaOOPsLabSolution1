package laboops1.assigment;
import java.util.Random;
public class Credentials {
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
		password[0]=capitalCaseLetter.charAt(random.nextInt(capitalCaseLetter.length()));
		password[1]=lowerCaseLetter.charAt(random.nextInt(lowerCaseLetter.length()));
		password[2]=specialCharacter.charAt(random.nextInt(specialCharacter.length()));
		password[3]=number.charAt(random.nextInt(number.length()));
		for(int i=4;i<length;i++) {
			password[i]=combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
		
		
	}
}

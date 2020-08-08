package Utilities;
import java.util.regex.*;
import java.util.regex.Pattern.*;
import java.util.regex.Matcher;


public class RandomValidators {	
	
	final static String phoneNumberRegex = "[6-9][0-9]{9}";
	final static String emailIdRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+(com|in|org|net|edu)$";;
	
	//email, phone no, pin number (int pin, int n (n digits long or no)), can book ride(wallet balance)
	
	//to check validity of the phone number
	public static boolean checkPhoneNumber(String phoneNumber) {
		if(phoneNumber.matches(phoneNumberRegex)) {
			return true;
		} else {
			return false;
		}
	}

	//to check validity of the emailId
	public static boolean checkEmailId(String emailId) {
		Pattern pat = Pattern.compile(emailIdRegex);
		if(emailId == null) {
			return false;
		}
		return pat.matcher(emailId).matches();

		// if(emailId.matches(emailIdRegex)) {
		// 	return true;
		// } else {
		// 	return false;
		// }
	}

	//to check if a pin number is valid
	public static boolean checkPinNumber(int pinNumber, int n) {
		int countNumber = 0;
		int numberCopy = pinNumber;
		while(numberCopy != 0) {
			numberCopy /= 10;
			++countNumber;
		}
		if(countNumber == n) {
			return true;
		} else {
			return false;
		}
	}
}
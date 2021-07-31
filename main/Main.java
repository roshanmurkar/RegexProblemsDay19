package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		// creating object for uc1
		EmailValidation emailValidation = new EmailValidation();
		emailValidation.validateMail();


		EmailValidationPartTwo emailValidationPartTwo=new EmailValidationPartTwo();
		emailValidationPartTwo.validateMail();

		EmailValidationPartThree emailValidationPartThree=new EmailValidationPartThree();
		emailValidationPartThree.validateMail();
	}
}

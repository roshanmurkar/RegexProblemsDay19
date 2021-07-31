package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		
		EmailValidation emailValidation = new EmailValidation();
		emailValidation.validateMail();


		EmailValidationPartTwo emailValidationPartTwo=new EmailValidationPartTwo();
		emailValidationPartTwo.validateMail();

		EmailValidationPartThree emailValidationPartThree=new EmailValidationPartThree();
		emailValidationPartThree.validateMail();
		
		EmailValidationPartFour emailValidationPartFour=new EmailValidationPartFour();
		emailValidationPartFour.validateMail();
	}
}

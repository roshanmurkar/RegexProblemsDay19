package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationPartThree {
	public void validateMail() {
		int flag=0;
		Pattern pattern=Pattern.compile("^[0-9A-Za-z.]+@bridgelabz.co");
		Matcher matcher=pattern.matcher("abc.xyz@bridgelabz.co.in");
		while(matcher.find()) {
			flag=1;
		}
		if(flag==1) {
			System.out.println("valid email");
		}else {
			System.out.println("invalid email");
		}
	}
}
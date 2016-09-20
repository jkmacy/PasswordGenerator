package generator;

import java.util.Scanner;
import static java.lang.System.*;

public class Generator {

	public static void main(String[] args) {
		// TODO Procedure for generating a password
		Scanner input = new Scanner(System.in); String inputString;
		out.println("Welcome to the password generator! We use your domain name, as well as unique information about you to generate "
							+ "an understandable password to use for a website.");
		out.print("Enter the domain name of the website (i.e. for www.google.com, enter google): ");
		inputString = input.next();
		cipher(inputString);
	}
	
	public static String cipher(String string) {
		String newString = string;
		//for (int c = 0; c < )
		return newString;
	}

}

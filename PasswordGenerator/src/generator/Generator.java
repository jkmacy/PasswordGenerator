package generator;

import java.util.Scanner;
import static java.lang.System.*;

public class Generator {
	static String inputString = ""; static String manString = "";
	public static void main(String[] args) {
		// TODO Procedure for generating a password
		Scanner input = new Scanner(System.in);
		out.println("Welcome to the password generator! We use your domain name, as well as unique information about you to generate "
							+ "an understandable password to use for a website.");
		out.print("Enter the domain name of the website (i.e. for www.google.com, enter google): ");
		inputString = input.nextLine();
		manString = inputString;
		
		reverse(); out.print("Reversing the string: ");
		input.nextLine();
		out.println(manString);
		
		cipher(); out.print("Shifting via caesar cipher by 22: ");
		input.nextLine();
		out.println(manString);
		
		switch2And4(manString); out.print("Switching the second and fourth characters: ");
		input.nextLine();
		out.println(manString);
		
		addFirstLast(); out.print("Adding the first and last characters of the domain in upper-case form: ");
		input.nextLine();
		out.println(manString);
		
		int fav = 20; String temp = "";
		do {
			out.print("What is your favorite digital number?: ");
			temp = input.nextLine();
			if (temp.matches("[0-9]+")) fav = Integer.parseInt(temp);
		} while (temp.length()!=2);
		
		addFavDDNum(fav); out.println("Adding your favorite double-digit number: \n" + manString);
		
		digit2Symbol(); out.print("Converting second digit into the corresponding shift value on the keyboard: ");
		input.nextLine();
		out.println(manString);
		input.close();
	}
	
	public static void reverse() {
		String newString = "";
		for (int c = manString.length() - 1; c >= 0; c--) {
			newString += manString.charAt(c);
		}
		manString = newString;
	}
	
	public static void cipher() {
		String newString = "";
		for (int c = 0; c < manString.length(); c++) {
			newString += (char)((manString.charAt(c) - 97 + 22)% 26 + 97);
		}
		manString = newString;
	}
	
	public static void switch2And4(String string) {
		if (string.length() == 3)
			manString = "" + manString.charAt(0)+ manString.charAt(2) + manString.charAt(1);
		if (string.length() == 2)
			manString = "" + manString.charAt(1) + manString.charAt(0);
		manString = "" + manString.charAt(0) + manString.charAt(3) + manString.charAt(2) + manString.charAt(1) + manString.substring(4);
	}
	
	public static void addFirstLast() {
		manString = inputString.substring(0,1).toUpperCase() + manString + inputString.substring(inputString.length()-1).toUpperCase();
	}
	
	public static void addFavDDNum(int fav) {
		manString = fav + manString;
	}
	
	public static void digit2Symbol() {
		char second = manString.charAt(1);
		switch (second) {
		case '0': second = ')'; break;
		case '1': second = '!'; break;
		case '2': second = '@'; break;
		case '3': second = '#'; break;
		case '4': second = '$'; break;
		case '5': second = '%'; break;
		case '6': second = '^'; break;
		case '7': second = '&'; break;
		case '8': second = '*'; break;
		case '9': second = '('; break;
		}
		manString = "" + manString.charAt(0) + second + manString.substring(2);
	}

}

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		calculator();
		return;
	}
	public static double doTheMath(int a, String b, int c) {
		double answer = 0;

		if (b.equalsIgnoreCase("+")) {
			answer = a + c;
		} else if (b.equalsIgnoreCase("-")) {
			answer = a - c;
		} else if (b.equalsIgnoreCase("x")) {
			answer = a * c;
		} else if (b.equalsIgnoreCase("/")) {
			answer = a / c;
		} else if (b.equalsIgnoreCase("!")) {
			answer = 1;
			for (int i = 1; i <= a; i++) {
				answer = answer * i;
			}
		}
		return answer;
	}
	static int readInput()
	{
		int enteredNumber = 0;
		Scanner myScanner = new Scanner(System.in);
		boolean numberError = false;
		String enteredString = "";
		do {
			try {
				enteredString = myScanner.next();
				enteredNumber = Integer.parseInt(enteredString.trim());
				numberError = false;
				if(enteredNumber<0) {
					numberError=false;
				}
				if(enteredNumber==0) {
					numberError=false;
				}
			} 
			catch(Exception e) {
				System.out.print("Your entry: \"" + enteredString + "\" is invalid...Please try again: ");
				numberError = true;
			}
		} while (numberError == true );
		return enteredNumber;
	}
	static String readString()
	{
		Scanner myScanner = new Scanner(System.in);
		boolean stringError = false;
		String enteredString = "";
		do {
			try {
				System.out.print("Which function would you like to use?\n + for addition\n - for subtraction\n x for multiplication\n / for division\n or ! for factorial");
				enteredString = myScanner.next();
				enteredString = enteredString.toLowerCase();
				if(enteredString.equals("+")||enteredString.equals("-")||enteredString.equals("x")||enteredString.equals("/")||enteredString.equals("!")) {
					stringError=false;
				}
				else{
					System.out.println("** \""+enteredString+"\" is an Invalid Response**");
					stringError=true;
				}
			} 
			catch(Exception e) {
				System.out.println("Your entry: \"" + enteredString + "\" is invalid...Please try again");
				stringError = true;
			}
		} while (stringError == true );
		return enteredString;
	}
	static void calculator(){
		System.out.println("Welcome to the calculator.");
		String b= readString();
		String choice="yes";
		int a;
		int c = 0;
		if (b.equals("!")==true){
			System.out.print("Choose a number");
			a= readInput();
		}
		else{
			System.out.println("Choose two numbers");
			System.out.print("Number 1: ");
			a= readInput();
			System.out.print("Number 2: ");
			c= readInput();
		}
		System.out.println(doTheMath(a,b,c));
		choice= readEnd();
		if(choice.equals("yes")==true){
			calculator();
		}
		else if(choice.equals("no")==true){
			System.out.println("Have a lovely day.");
			return;
		}

	}
	static String readEnd()
	{
		Scanner myScanner = new Scanner(System.in);
		boolean stringError = false;
		String enteredString = "";
		do {
			try {
				System.out.print("Do you want to play again? Please enter Yes or No: ");
				enteredString = myScanner.next();
				enteredString = enteredString.toLowerCase();
				if(enteredString.equals("yes")||enteredString.equals("no")) {
					stringError=false;
				}
				else{
					System.out.println("** \""+enteredString+"\" is an Invalid Response**");
					stringError=true;
				}
			} 
			catch(Exception e) {
				System.out.println("Your entry: \"" + enteredString + "\" is invalid...Please try again");
				stringError = true;
			}
		} while (stringError == true );
		return enteredString;
	}

}

import java.util.Scanner;
//import java.io.IOException;
//import java.util.ArrayList; 

public class cardChecker {
	static Scanner userLongInput = new Scanner(System.in);
	static long number;

	public static void main(String[] args) 
	{
		welcome();
		loadArray();
	}
	public static long welcome()
	{
		System.out.println("HELLO! Welcome to Credit Card number Validation! Please input a 16 digit credit card number (no spaces) and I will tell you if this number is a possible validated number!");
		number = userLongInput.nextLong();
		return number;
	}
	public static long [] loadArray()
	{
		long [] original = new long[16];
		while (number > 0)
		{
			int sum = 1;
			long temporary = number % 10;
			number = number/10;
			original[original.length - sum] = temporary;
		}
		System.out.println(original);
		return original;
	}

}

import java.util.Scanner;
import java.util.ArrayList; 

public class cardChecker {
	public static void main(String[] args) 
	{
		static long number;
		welcome();
		loadArray();
	}
	public static long welcome()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("HELLO! Welcome to Credit Card number Validation! Please input a 16 digit credit card number (no spaces) and I will tell you if this number is a possible validated number!");
		number = userInput.nextLong();
		return number;
	}
	public static ArrayList <Long> loadArray()
	{
		ArrayList <Long> original = new ArrayList<Long>();
		while (cardNumber > 0)
		{
			int temporary = number % 10;
			number = number/10;
			original[original.length()] = temporary;
		}
		return original;
	}

}

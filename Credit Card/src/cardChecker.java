import java.util.Scanner;

public class cardChecker {
	public static void main(String[] args) {
		long cardNumber = welcome();
	}
	public static int welcome()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("HELLO! Welcome to Credit Card number Validation! Please input a 16 digit credit card number (no spaces) and I will tell you if this number is a possible validated number!");
		long number = userInput.nextLong();
		return number;
	}
	public void loadArray(long cardNumber)
	{
		while (cardNumber > 0)
		{
			int temporary = number % 10;
			
		}
	}
	long [] rawNumber

}

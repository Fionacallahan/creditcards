import java.util.Scanner;
//import java.io.IOException;
//import java.util.ArrayList; 

public class cardChecker {
	static Scanner userLongInput = new Scanner(System.in);
	static long number;
	static int [] original;
	static long [] doubleArray = new long[8];

	public static void main(String[] args) 
	{
		welcome();
		loadArray();
		doubleDigits();
	}
	public static long welcome()
	{
		System.out.println("HELLO! Welcome to Credit Card number Validation! Please input a 16 digit credit card number (no spaces) and I will tell you if this number is a possible validated number!");
		number = userLongInput.nextLong();
		return number;
	}
	public static void loadArray()
	{
		original = new int[16];
		System.out.print(number);
		int sum = 1;
		while (number > 0)
		{
			int temporary = (int) (number % 10);
			number = number/10;
			original[original.length - sum] = temporary;
			sum ++;
		}
		for (int i = 0; i < original.length; i++)
		{
			System.out.println(original[i]);
		}
		
		//return original;
	}
	
	public static void doubleDigits()
	{
		int sum2 = 0;
		for (int i = 0; i < original.length - 2; i += 2)
		{
			long doubleDigit = original[i] * 2;
			doubleArray[sum2] = doubleDigit;
			sum2 ++;
		}
		for (int i = 0; i < original.length; i ++)
		{
			System.out.println(doubleArray[i]);
		}
		//return doubleArray;
	}
	public static void addDigits()
	{
		for(int i = 0; i < doubleArray.length; i ++)
		{
			
		}
	}

}

import java.util.Scanner;
//import java.io.IOException;
//import java.util.ArrayList; 

public class cardChecker {
	static Scanner userLongInput = new Scanner(System.in);
	static long number;
	static int [] original;
	static long [] doubleArray = new long[8];
	static int credit;
	static int [] showArray; 

	public static void main(String[] args) 
	{
		//extraCredit();
		welcome();
		loadArray();
		System.out.println();
		doubleDigits();
		System.out.println();
		goBack();
	}
	public static long welcome()
	{
		System.out.println("HELLO! Welcome to Credit Card number Validation! Please input a 16 digit credit card number (no spaces) and I will tell you if this number is a possible validated number!");
		number = userLongInput.nextLong();
		return number;
	}
	public static void extraCredit()
	{
		credit = 0;
		original = new int[16];
		showArray = new int[16];
		while (credit != 100)
		{
			for (int i = 0; i < 16; i ++)
			{
				int random = (int)(Math.random()*10);
				original[i] = random;
				showArray[i] = random;
			}
			//loadArray();
			//System.out.println();
			doubleDigits();
			//System.out.println();
			goBack();
		}
	}
	public static int[] loadArray()
	{
		original = new int[16];
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
			System.out.print(original[i]);
		}
		
		return original;
	}
	
	public static long[] doubleDigits()
	{
		int sum2 = 0;
		for (int i = 0; i < original.length; i += 2)
		{
			int doubleDigit = original[i] * 2;
			if (doubleDigit >= 10)
			{
				int left = doubleDigit/10;
				int right = doubleDigit%10;
				doubleDigit = left + right;
				doubleArray[sum2] = doubleDigit;
			}
			else {
				doubleArray[sum2] = doubleDigit;
			}
			sum2 ++;
		}
		//for (int i = 0; i < doubleArray.length; i ++)
		//{
			//System.out.print(doubleArray[i]);
		//}
		return doubleArray;
	}
	public static void goBack()
	{
		int sum3 = 0;
		for (int j = 0; j < original.length; j += 2)
		{
			original[j] = (int) doubleArray[sum3];
			sum3++; 
		}
		int finalSum = 0;
		for (int s = 0; s < original.length; s ++)
		{
			finalSum += original[s];
		}
		if (finalSum % 10 == 0)
		{
			//for (int z = 0; z < showArray.length; z++)
			//{
				//System.out.print(showArray[z]);
			//}
			System.out.println(": This is a potentially valid credit card number!");
			//credit++;
		}
		else {
			//System.out.println("no");
			System.out.println("This is not a valid credit card number!");
		}
		
	}

}

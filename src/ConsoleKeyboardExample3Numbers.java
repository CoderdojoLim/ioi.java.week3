import java.util.Scanner;

/**
 @author Mark Crowe
 */
public class ConsoleKeyboardExample3Numbers
{
	public static void main(String[] args)
	{
		//
		//	varaibles
		//
		int number1, number2, number3, sum;
		//
		//	input
		//
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println("Please enter three numbers?");
		number1 = consoleScanner.nextInt();
		number2 = consoleScanner.nextInt();
		number3 = consoleScanner.nextInt();
		//
		//	work
		//
		sum = number1 + number2 + number3;
		//
		//	output
		//
		System.out.println("The sum of " + number1 + " + " + number2 + " + " + number3 + " + is " + sum);
	}
}

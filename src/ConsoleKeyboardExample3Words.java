import java.util.Scanner;

/**
 @author Mark Crowe
 */
public class ConsoleKeyboardExample3Words
{
	public static void main(String[] args)
	{
		//
		//	varaibles
		//
		String text1, text2, text3;
		//
		//	input
		//
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println("Please enter three words?");
		text1 = consoleScanner.next();
		text2 = consoleScanner.next();
		text3 = consoleScanner.next();
		//
		//	output
		//
		System.out.println("THe first 3 words entered are {" + text1 + ", " + text2 + ", " + text3 + "}");
	}
}

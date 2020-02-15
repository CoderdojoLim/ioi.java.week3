import java.util.Scanner;

/**
 @author Mark Crowe
 */
public class ConsoleKeyboardExample
{
	public static void main(String[] args)
	{
		//
		//	varaibles
		//
		String name;
		int text;
		//
		//	input
		//
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println("Please enter a line of text?");
		name = consoleScanner.nextLine();
		System.out.println("Please enter a number?");
		text = consoleScanner.nextInt();
		//
		//	output
		//
		System.out.println("Text: " + name);
		System.out.println("Number: " + text);
	}

}

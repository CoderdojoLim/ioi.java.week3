
/**
 @author Mark Crowe
 */
public class RelationalOperatorEample
{
	public static void main(String[] args)
	{
		int largerNumber = 100, smallerNumber = 10;
		
		System.out.println("Relational operators");
		System.out.println();

		System.out.println("Relational operators return a boolean");

		System.out.println("In Java The 'Equals' operator is written as '=='");
		System.out.println("In Java The 'Less Than' operator is written as '<'");
		System.out.println("In Java The 'Greater Than' operator is written as '>'");

		System.out.println();
		System.out.println("'Equals' Examples");
		System.out.println(largerNumber + " == " + smallerNumber + " -> " + (largerNumber == smallerNumber));
		System.out.println(smallerNumber + " == " + largerNumber + " -> " + (smallerNumber == largerNumber));
		System.out.println(largerNumber + " == " + largerNumber + " -> " + (largerNumber == largerNumber));
		System.out.println(smallerNumber + " == " + smallerNumber + " -> " + (smallerNumber == smallerNumber));

		System.out.println();
		System.out.println("'Less Than' Examples");
		System.out.println(largerNumber + " < " + smallerNumber + " -> " + (largerNumber < smallerNumber));
		System.out.println(smallerNumber + " < " + largerNumber + " -> " + (smallerNumber < largerNumber));
		System.out.println(largerNumber + " < " + largerNumber + " -> " + (largerNumber < largerNumber));
		System.out.println(smallerNumber + " < " + smallerNumber + " -> " + (smallerNumber < smallerNumber));

		System.out.println();
		System.out.println("'Greater Than' Examples");
		System.out.println(largerNumber + " > " + smallerNumber + " -> " + (largerNumber > smallerNumber));
		System.out.println(smallerNumber + " > " + largerNumber + " -> " + (smallerNumber > largerNumber));
		System.out.println(largerNumber + " > " + largerNumber + " -> " + (largerNumber > largerNumber));
		System.out.println(smallerNumber + " > " + smallerNumber + " -> " + (smallerNumber > smallerNumber));
	}

}

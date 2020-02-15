
/**
 @author Mark Crowe
 */
public class BooleanOrOperatorEample
{
	public static void main(String[] args)
	{

		System.out.println("The 'Or' operator Truth Table");
		System.out.println();

		System.out.println("In java the 'Or' operator is written as '||'");
		System.out.println();

		boolean True = true, False = false;
		System.out.println("InputA || InputB -> Result");
		System.out.println(True + " || " + True + " -> " + (True || True));
		System.out.println(True + " || " + False + " -> " + (True || False));
		System.out.println(False + " || " + True + " -> " + (False || True));
		System.out.println(False + " || " + False + " -> " + (False || False));

	}

}

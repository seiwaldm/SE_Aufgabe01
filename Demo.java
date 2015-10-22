import java.util.Scanner;

/**
 * PS Software Engineering WS2015 <br>
 * <br>
 * 
 * demo-method to test implementation of RPN class
 * 
 * @author Kevin Schoergnhofer
 * @author Markus Seiwald
 *
 */

public class Demo {

	/**
	 * @param args
	 *            input Strings for the RPN
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ask user which kind of stack to create
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (!input.equals("1") && !input.equals("2")) {
			System.out.println("Enter 1 for ArrayStack, 2 for ListStack");
			input = scan.nextLine();
		}

		// create stack
		MyStack stack;
		if (input.equals("1")) {
			stack = new ArrayStack(args.length);
		} else {
			stack = new ListStack();
		}

		// perform calculation
		RPN rpn = new RPN();
		System.out.println(rpn.calculate(stack, args));
		System.out.println(stack.getSize());
	}

}

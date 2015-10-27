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

public class DemoRPN {

	/**
	 * @param args
	 *            input Strings for the RPN
	 */
	public static void main(String[] inputForRPN) {
		// TODO Auto-generated method stub
		// ask user which kind of stack to create
		Scanner scan = new Scanner(System.in);
		String input_selectStackType = "";
		while (!input_selectStackType.equals("1") && !input_selectStackType.equals("2")) {
			System.out.println("Enter 1 for ArrayStack, 2 for ListStack");
			input_selectStackType = scan.nextLine();
		}

		// create stack
		RPN rpn;
		if (input_selectStackType.equals("1")) {
         rpn = new RPN(new ArrayStack(inputForRPN.length));
		} else {
			rpn = new RPN(new ListStack());
		}

		// perform calculation
      try {
		   System.out.println("Result of your calculation: " + rpn.calculate(inputForRPN));
      }
      catch (EmptyStackException ese) {
         System.out.println("It seems that you entered a inexecutable term. The stack-based calculator reports: " + ese.getMessage());
      }
      catch (FullStackException fse) {
         System.out.println("It seems that your entered term is too long. Please shorten your term or switch to the linked-list-based stack. The stack-based calculator reports: " + fse.getMessage());
      }
      catch (InvalidInputException iie) {
         System.out.println("It seems that your entered term does not fit to the supposed pattern. The calculator reports: " + iie.getMessage());
      }   
              
	}

}

/**
 * PS Software Engineering WS2015 <br>
 * <br>
 * 
 * implementation of a reverse-polish-notation calculator
 * 
 * @author Kevin Schoergnhofer
 * @author Markus Seiwald
 *
 */
 
public class RPN {

   MyStack stack;
   
   public RPN (MyStack stack) {
      this.stack = stack;
   }   

	/**
	 * performs basic arithmetic operations (+,-,*,/)
	 * 
	 * @param stack any stack that implements the MyStack interface
	 * @param args an array of string arguments passed via the command line
	 * @return returns the result as double
	 */
	public double calculate(String[] args) throws EmptyStackException, FullStackException, InvalidInputException {
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("+")) {
				double b = (double) stack.pop();
				double a = (double) stack.pop();
				double c = a + b;
				stack.push(c);
			} else if (args[i].equals("-")) {
				double b = (double) stack.pop();
				double a = (double) stack.pop();
				double c = a - b;
				stack.push(c);
			} else if (args[i].equals("*")) {
				double b = (double) stack.pop();
				double a = (double) stack.pop();
				double c = a * b;
				stack.push(c);
			} else if (args[i].equals("/")) {
				double b = (double) stack.pop();
				double a = (double) stack.pop();
				double c = a / b;
				stack.push(c);
         } else if (i == args.length - 1) {
            throw new InvalidInputException("The last element of the input must be an operator!");   
			} else {
				double value = Double.parseDouble(args[i]);
				stack.push(value);
			}
		}
      if (stack.getSize() > 1) {
         throw new InvalidInputException("There are more than two numbers but no operator left!");
      }   
		return (double) stack.pop();
	}
}

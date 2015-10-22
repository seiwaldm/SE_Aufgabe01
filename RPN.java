/**
 * PS Software Engineering WS2015 <br>
 * <br>
 * 
 * implementation of a reverse-polish-notation calculator
 * 
 * @author Kevin Schörgnhofer
 * @author Markus Seiwald
 *
 */
public class RPN {

	public RPN(){
	}

	/**
	 * performs basic arithmetic operations (+,-,*,/)
	 * 
	 * @param stack any stack that implements the MyStack interface
	 * @param args an array of string arguments passed via the command line
	 * @return returns the result as double
	 */
	double calculate(MyStack stack, String[] args) {
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
			} else {
				double value = Double.parseDouble(args[i]);
				stack.push(value);
			}
		}
		return (double) stack.pop();
		/*
		 * TODO: wenn am Ende des Inputs kein Operator steht, 
		 * soll eine Exception geworfen werden... asonsten gibt der RPN 
		 * ein falsches Ergebnis zurück!
		 */
	}
}

/**
 * PS Software Engineering WS2015 <br>
 * <br>
 * 
 * implementation of a LIFO-stack based on an array
 * 
 * @author Kevin Schoergnhofer
 * @author Markus Seiwald
 *
 */

public class ArrayStack<T> implements MyStack<T> {

	private int position = 0;
	private Object stack[];

	public ArrayStack(int size) {
		this.stack = new Object[size];
	}

	public void push(T t) throws FullStackException {
		if (position > stack.length - 1)
			throw new FullStackException("There is no free space left on the stack");
		stack[position] = t;
		position++;
	}

	public T pop() throws EmptyStackException {
		if (position < 1)
			throw new EmptyStackException("There are no elements left on the stack");
		position--;
		return (T) stack[position];
	}

	public int getSize() {
		return position;
	}
}

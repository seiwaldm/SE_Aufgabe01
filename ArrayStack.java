/**
 * PS Software Engineering WS2015 <br><br>
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

	public void push(T t) {
		if (position > stack.length - 1)
			throw new IndexOutOfBoundsException("Kein Platz auf dem Stack verfuegbar");
		stack[position] = t;
		position++;
	}

	public T pop() {
		if (position < 1)
			throw new IndexOutOfBoundsException("Keine Elemente auf dem Stack verfuegbar");
		position--;
		return (T) stack[position];
	}

	public int getSize() {
		return position;
	}
}

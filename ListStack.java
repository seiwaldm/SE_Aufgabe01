/**
 * PS Software Engineering WS2015 <br>
 * <br>
 * 
 * implementation of a LIFO-stack based on a linked list
 * 
 * @author Kevin Schoergnhofer
 * @author Markus Seiwald
 *
 */
public class ListStack<T> implements MyStack<T> {

	private Entry head;

	public ListStack() {
		this.head = new Entry(null, null);
	}

	@Override
	public void push(T t) {
		this.head = new Entry(t, this.head);
	}

	@Override
	public T pop() {
		T pop = this.head.value;
		this.head = this.head.next;
		return pop;
	}

	@Override
	public int getSize() {
		int counter=-1;
		Entry current = this.head;
		while (current != null){
			counter++;
			current = current.next;
		}
		return counter;
	}

	/**
	 * inner class to manage stack entries
	 */
	private class Entry {

		private T value;
		private Entry next;

		private Entry(T data, Entry next) {
			this.value = data;
			this.next = next;
		}
	}
}

/**
 * PS Software Engineering WS2015 <br>
 * <br> 
 * @author Kevin Schoergnhofer
 * @author Markus Seiwald
 */
public interface MyStack<T> {

	/**
	 * put an item onto the stack
	 * 
	 * @param t
	 *            generic item
	 */
	public void push(T t);

	/**
	 * get an item from the stack
	 * 
	 * @return returns the last item added
	 */
	public T pop();

	/**
	 * 
	 * get the size of the stack
	 * 
	 * @return returns the number of elements on the stack
	 */
	public int getSize();
}

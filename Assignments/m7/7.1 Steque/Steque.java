/**
 * Class for steque.
 *
 * @param      <E>   generic object.
 */
public class Steque<E> {
    /**
	 * Using Linked Lists.
	 */
	LinkedList<E> list;
	/**
	 * Constructs the constructor of Steque.
	 */

	Steque() {
		list = new LinkedList<>();
	}
	/**
	 * Determines if list is empty or not.
	 *
	 * @return     True if empty, False otherwise.
	 */

	public boolean isEmpty() {

		return list.isEmpty();
	}
	/**
	 * push element to head of list.
	 * time complexity for push is 1.
	 *
	 * @param      e     { parameter_description }
	 */

	public void push(final E e) {
		list.push(e);
		System.out.println(list);
	}
	/**
	 * deletes element.
	 * time complexity for pop is 1.
	 */

	public void pop() {
		if(isEmpty()) {
			System.out.println("Steque is empty.");
		} else {
		list.pop();
		System.out.println(list);
	}
}
/**
 * add's element to tail of list.
 * time complexity for enqueue is 1.
 *
 * @param      ele   The ele
 */

	public void enqueue(final E ele) {
		list.pushLast(ele);
		System.out.println(list);

	}
}
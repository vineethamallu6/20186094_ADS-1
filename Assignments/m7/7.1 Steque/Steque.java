
public class Steque<E> {

	/**
	 * Using Linked Lists.
	 */
	LinkedList<E> list;

	Steque() {
		list = new LinkedList<>();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E e) {
		list.push(e);
		System.out.println(list);
	}

	public void pop() {
		if(isEmpty()) {
			System.out.println("Steque is empty.");
		} else {
		list.pop();
		System.out.println(list);
	}
}

	public void enqueue(E ele) {
		list.pushLast(ele);
		System.out.println(list);

	}
}
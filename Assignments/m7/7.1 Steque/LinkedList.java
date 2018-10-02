/**
 * List of linkeds.
 *
 * @param      <E>   generic parameter.
 */
class LinkedList<E> {
	/**
	 * Class for node.
	 */

	private class Node {
		/**
		 * data.
		 */

		E data;
		/**
		 * next.
		 */
		Node next;
		/**
		 * empty constructor.
		 */

		Node() {
			//for check style purpose.
		}
		/**
		 * Constructor for Node.
		 *
		 * @param      data  The data
		 */

		Node(final E data) {
			this(data, null);
		}
		/**
		 * Constructor for Node.
		 *
		 * @param      data  The data
		 * @param      next  The next
		 */

		Node(final E data, final Node next) {
			this.data = data;
			this.next = next;
		}
		/**
		 * Gets the next.
		 *
		 * @return     The next node.
		 */
	public Node getNext() {
        return next;
    }
    /**
     * Sets the next.
     *
     * @param      node  The node
     */

    public void setNext(final Node node) {
        next = node;
    }
    /**
     * Gets the data.
     *
     * @return     The data.
     */

    public E getData() {
        return data;
    }
    /**
     * Sets the data.
     *
     * @param      elem  The element
     */

    public void setData(final E elem) {
        data = elem;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */

 	public String toString() {
        return data + "";
    }
	}
	/**
	 * head.
	 */
	private Node head;
	/**
	 * tail.
	 */
	private Node tail;
	/**
	 * size
	 */
	private int size = 0;
	/**
	 * push element to get added to list.
	 * time complexity for push is 1.
	 *
	 * @param      e     element.
	 */

	public void push(final E e) {
		Node newnode = new Node();
		newnode.data = e;
		newnode.next = head;

		if (head == null) {
		tail = newnode;

		}

		head = newnode;
		size++;
	}
	/**
	 * Pushes the element to the last of list.
	 * time complexity for push is 1.
	 * @param      e     element.
	 */
	public void pushLast(final E e) {
		if(head == null && tail == null) {
			Node newnode = new Node();
			newnode.data = e;
			tail = head = newnode;


		} else {
		Node newnode= new Node();
		newnode.data = e;
		tail.next = newnode;
		tail = newnode;
	}
	size++;

}
/**
 * deletes the element from head of list.
 * time complexity for pop is 1.
 */

	public void pop() {
		if(size == 1){
			tail = head = null;
			size = 0;
			return;

		}

		E data = head.data;
		head = head.next;
		size--;
}

/**
 * Determines if empty.
 * time complexity for isEmpty 1.
 *
 * @return     True if empty, False otherwise.
 */
	public boolean isEmpty() {
		return head == null;
	}
	/**
	 * Returns a string representation of the object.
	 * time complexity for toString is n.
	 *
	 * @return     String representation of the object.
	 */

	public String toString() {
        String result = "";
        if (head == null) {
            return "Steque is empty.";
        }
        result = result + head.getData();
        Node temp = head.getNext();
        while (temp != null) {
            result = result + ", " + temp.getData();
            temp = temp.getNext();
            }
        return result;

    }

}
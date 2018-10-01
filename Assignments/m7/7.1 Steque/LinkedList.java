class LinkedList<E> {

	private class Node {

		E data;
		Node next;

		Node() {}

		Node(E data) {
			this(data, null);
		}

		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public E getData() {
        return data;
    }

    public void setData(E elem) {
        data = elem;
    }

 		   public String toString() {
        return data + "";
    }
	}
	private Node head;
	private Node tail;
	private int size = 0;

	public void push(E e) {
		Node newnode = new Node();
		newnode.data = e;
		newnode.next = head;

		if (head == null) {
		tail = newnode;

		}

		head = newnode;
		size++;
	}
	public void pushLast(E e) {
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

	public boolean isEmpty() {
		return head == null;
	}

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
import java.util.Scanner;
/**
 * Class for node.
 */
class Node {
	/**
	 * data.
	 */
	int data;
	/**
	 * node object next.
	 */
	Node next;
	/**
	 * Constructs the object.
	 *
	 * @param      val   The value
	 */
	Node(final int val) {
		this.data = val;
	}
}
/**
 * List of linkeds.
 */
class LinkedList {
	/**
	 * { var_description }
	 */
	Node head;
	/**
	 * { var_description }
	 */
	int size;
	/**
	 * Constructs the object.
	 */
	LinkedList() {
		head = null;
		size = 0;
	}
	/**
	 * { function_description }
	 *
	 * @param      position   The position
	 * @param      val        The value
	 *
	 * @throws     Exception  { exception_description }
	 */
	void insertAt(final int position, final int val)throws Exception {
		if (position < 0 || position > size) {
			throw new Exception();
		}
		Node newNode = new Node(val);
		head = insertAt(position, head, newNode, 0);
	}
	/**
	 * { function_description }
	 *
	 * @param      position   The position
	 * @param      head       The head
	 * @param      newNode    The new node
	 * @param      count      The count
	 *
	 * @return     { description_of_the_return_value }
	 *
	 * @throws     Exception  { exception_description }
	 */
	Node insertAt(final int position, final Node head, final Node newNode, final int count) throws Exception {
		if (position == count) {
			newNode.next = head;
			size++;
			return newNode;
		}
		head.next = insertAt(position, head.next, newNode, count+1);
		return head;
	}
	/**
	 * { function_description }
	 */
	void reverse() {
		reverse(null, head);
	}
	/**
	 * { function_description }
	 *
	 * @param      preTemp  The pre temporary
	 * @param      temp     The temporary
	 */
	void reverse(final Node preTemp, final Node temp) {
		if (temp != null) {
			reverse(temp, temp.next);
			temp.next = preTemp;
		} else {
			head = preTemp;
		}
	}
	/**
	 * { function_description }
	 */
	void display() {
		Node temp = head;
		String str = "";
		while(temp != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		System.out.println(str.substring(0, str.length() - 2));
	}
}
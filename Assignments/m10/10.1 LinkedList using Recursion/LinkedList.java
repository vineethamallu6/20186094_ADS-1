import java.util.Scanner;
class Node {
	int data;
	Node next;
	Node(int val) {
		this.data = val;
	}
}
class LinkedList {
	Node head;
	int size = 0;
	LinkedList() {
		head = null;
		size = 0;
	}
	void insertAt(int position, int val)throws Exception {
		if (position < 0 || position > size) {
			throw new Exception();
		}
		Node newNode = new Node(val);
		head = insertAt(position, head, newNode, 0);
	}
	Node insertAt(int position, Node head, Node newNode, int count) throws Exception {
		if (position == count) {
			newNode.next = head;
			size++;
			return newNode;
		}
		head.next = insertAt(position, head.next, newNode, count+1);
		return head;
	}
	void reverse() {
		reverse(null, head);
	}
	void reverse(Node preTemp, Node temp) {
		if (temp != null) {
			reverse(temp, temp.next);
			temp.next = preTemp;
		} else {
			head = preTemp;
		}
	}
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
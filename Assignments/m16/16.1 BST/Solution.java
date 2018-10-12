import java.util.Scanner;
/**
 * Class for book.
 */
class Book implements Comparable<Book> {
	/**
	 * { name }.
	 */
	private String name;
	/**
	 * { author }.
	 */
	private String author;
	/**
	 * { price }.
	 */
	private String price;
	/**
	 * Constructs the object.
	 *
	 * @param      n     { parameter_description }
	 * @param      a     { parameter_description }
	 * @param      p     { parameter_description }
	 */
	Book(String n, String a, String p) {
		this.name = n;
		this.author = a;
		this.price = p;
	}
	/**
	 * Gets the name.
	 * time complexity is 1.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Gets the author.
	 * time complexity is 1.
	 * @return     The author.
	 */
	public String getAuthor() {
		return this.author;
	}
	/**
	 * Gets the price.
	 * time complexity is 1.
	 * @return     The price.
	 */
	public String getPrice() {
		return this.price;
	}
	/**
	 * { compares between names }.
	 * time complexity is 1
	 *
	 * @param      that  The that.
	 *
	 * @return     { return int value }.
	 */
	public int compareTo(Book that) {
		return this.name.compareTo(that.name);
	}

}
/**
 * Class for binary search tree.
 */
class BinarySearchTree {
	/**
	 * { root }.
	 */
	private Node root;
	/**
	 * { size }.
	 */
	private int size;
	/**
	 * Class for node.
	 */
	private class Node {
		/**
		 * { key }.
		 */
		Book key;
		/**
		 * { value }.
		 */
		String value;
		/**
		 * { left }.
		 */
		Node left;
		/**
		 * { right }.
		 */
		Node right;
		/**
		 * Constructs the object.
		 *
		 * @param      key    The key.
		 * @param      value  The value.
		 */
		Node(Book key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	/**
	 * Constructs the object.
	 */
	BinarySearchTree() {
		root = null;
	}
	/**
	 * { insert's the key and value}.
	 * time complexity is N.
	 *
	 * @param      key    The key.
	 * @param      value  The value.
	 */
	public void put(Book key, String value) {
		root = put(root, key, value);
	}
	/**
	 * { put's the key considering root }.
	 * time complexity is N.
	 *
	 * @param      x      { parameter_description }.
	 * @param      key    The key.
	 * @param      value  The value.
	 *
	 * @return     { description_of_the_return_value }.
	 */
	public Node put(Node x, Book key, String value) {
		if (x == null) {
			return new Node(key, value);
		}
		int compare = key.getName().compareTo(x.key.getName());
		if (compare < 0) {
			x.left = put(x.left, key, value);
		} else if (compare > 0) {
			x.right = put(x.right, key, value);
		} else if (compare == 0) {
			x.value = value;
		}
		return x;
	}
	/**
	 * { get's key value }.
	 * time complexity is log(N).
	 *
	 * @param      key   The key.
	 *
	 * @return     { return the key  }.
	 */
	public String get(Book key) {
		Node x = root;
		while (x != null) {
			int compare = key.getName().compareTo(x.key.getName());
			if (compare < 0) {
				x = x.left;
			} else if (compare > 0) {
				x = x.right;
			} else if (compare == 0) {
				return x.value;
			}
		}
		return null;
	}
}
/**
 * Client solution.
 */

class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {
		// constructor purpose.

	}
	/**
	 * main function.
	 *
	 * @param      args  The arguments.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 BinarySearchTree b = new BinarySearchTree();
		while (s.hasNext()) {
			String[] tokens = s.nextLine().split(",");
			switch (tokens[0]) {
				case "put":
				Book book = new Book(tokens[1], tokens[2], tokens[3]);
				b.put(book, tokens[4]);
				break;
				case "get":
				book = new Book(tokens[1], tokens[2], tokens[3]);
				System.out.println(b.get(book));
				break;
				default:
				break;
			}
		}
	}
}
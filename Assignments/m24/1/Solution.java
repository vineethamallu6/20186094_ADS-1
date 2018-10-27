import java.util.Scanner;
/**
 * Class for solution.
 */
class Student {
	private String name;
	private double marks;
	Student(final String n, final double m) {
		this.name = n;
		this.marks = m;
	}

	public String getName() {
		return this.name;
	}
	public double getMarks() {
		return this.marks;
	}
}
public final class Solution {
    /**
     * client class.
     */
    private Solution() {
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        SeparateChainingHashST<Integer, Student> students= new
        SeparateChainingHashST<>();
        Student stu = null;
        // LinearProbingHashST<String, Integer> hash
        // = new LinearProbingHashST<String, Integer>();
        //BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
        	String[] token = scan.nextLine().split(",");
        	stu = new Student(token[1], Double.parseDouble(token[2]));
        }
        int m = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < m; i++) {
        	String[] check = scan.nextLine().split(" ");
        	if (check[2].equals("1")) {
                int key = Integer.parseInt(check[1]);
                if (students.contains(key)) {
                    System.out.println(students.get(key).getName());
                } else {
                    System.out.println("Student doesn't exists...");
                }
            } else if (check[2].equals("2")) {
                int key = Integer.parseInt(check[1]);
                if (students.contains(key)) {
                    System.out.println(students.get(key).getMarks());
                } else {
                    System.out.println("Student doesn't exists...");
                }
            }

            }
        }
    }
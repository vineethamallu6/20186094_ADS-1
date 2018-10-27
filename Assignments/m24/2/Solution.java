import java.util.Scanner;
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
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		RedBlackBST<Student, Integer> students = new RedBlackBST<>();
        for (int i = 0; i < n; i++) {
        	String[] token = scan.nextLine().split(",");
        	Student stu = new Student(token[1], Double.parseDouble(token[2]));
        	students.put(stu, Integer.parseInt(token[0]));
        }
        int m = Integer.parseInt(scan.nextLine());
        for (int i =0; i < m; i++) {
        	String[] check = scan.nextLine().split(",");
        	if (check[0].equals("BE")) {
        		double range1 = Double.parseDouble(check[1]);
        		double range2 = Double.parseDouble(check[2]);
        		for (Student j : students.keys()) {
        			if (j.getMarks() >= range1 && j.getMarks() <= range2) {
        				System.out.println(j.getName());

        			}

        		}


        	} //else if (check[0].equals("GE")) {

        	// } else {

        	// }

        }
	}
}
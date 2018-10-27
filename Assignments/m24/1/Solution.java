import java.util.Scanner;
/**
 * Class for student.
 */
class Student {
    /**
     * name.
     */
    private String name;
    /**
     * marks.
     */
    private double marks;
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      m     { parameter_description }
     */
    Student(final String n, final double m) {
        this.name = n;
        this.marks = m;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */

    public String getName() {
        return this.name;
    }
    /**
     * Gets the marks.
     *
     * @return     The marks.
     */
    public double getMarks() {
        return this.marks;
    }
}
/**
 * Client solution.
 */
class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {
        //check style purpose.
        }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        SeparateChainingHashST<Integer, Student> students = new
        SeparateChainingHashST<>();
        for (int i = 0; i < n; i++) {
            String[] token = scan.nextLine().split(",");
            Student stu = new Student(token[1], Double.parseDouble(token[2]));
            students.put(Integer.parseInt(token[0]), stu);
        }
        int m = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < m; i++) {
            String[] check = scan.nextLine().split(" ");
            if (check[2].equals("1")) {
                int roll = Integer.parseInt(check[1]);
                if (students.contains(roll)) {
                    System.out.println(students.get(roll).getName());
                } else {
                    System.out.println("Student doesn't exists...");
                }
            } else if (check[2].equals("2")) {
                int roll = Integer.parseInt(check[1]);
                if (students.contains(roll)) {
                    System.out.println(students.get(roll).getMarks());
                } else {
                    System.out.println("Student doesn't exists...");
                }
            }
        }
    }
}


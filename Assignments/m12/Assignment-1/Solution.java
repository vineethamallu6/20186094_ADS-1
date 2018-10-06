import java.util.Scanner;
class Student{
	private String name;
	private String date;
	private int m1;
	private int m2;
	private int m3;
	private int total;
	private String caste;
	Student(String n, String d, int m1, int m2, int m3, int t, String c) {
		this.name = n;
		this.date = d;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = t;
		this.caste = c;
	}
	public String getName() {
		return this.name;
	}
	public String getDate() {
		return this.date;
	}
	public int getM1() {
		return this.m1;
	}
	public int getM2() {
		return this.m2;
	}
	public int getM3() {
		return this.m3;
	}
	public int getTotal() {
		return this.total;
	}
	public String getCaste() {
		return this.caste;
	}
	public void add(Student s) {

	}
	public int compareTo(final Student that) {
		if (this.getTotal() < that.getTotal()) {
			return 1;
		} else if (this.getTotal() > that.getTotal()) {
			return -1;
		} else {
			if (this.getM3() < that.getM3()) {
				return 1;
			} else if (this.getM3() > that.getM3()) {
				return -1;
			} else {
				if (this.getM2() < that.getM2()) {
					return 1;
				}
				else if (this.getM2() > that.getM2()) {
					return -1;
				} else {
					if (this.getM1() < that.getM1()) {
						return 1;
					}
					else if (this.getM1() > that.getM1()) {
						return -1;
					}
				}
			}
		}
		return 0;

	}
}
class Sorting {
	private final int hundred = 100;
	private Student[] list;
	private int size;
	Sorting() {
		list = new Student[hundred];
		size = 0;
	}
	public void add(final Student s) {
        list[size++] = s;
    }
    public void sort() {
    	for (int i = 0; i < size; i++) {
    		Student student = list[i];
    		int j = i -1;
    		int count = student.compareTo(list[j]);
    		while (j >= 0 && count == -1) {
    			list[j + 1] = list[j];
    			j--;
    			if (j >= 0) {
    				count = student.compareTo(list[j]);
    			}
    			list[j + 1] = student;
    		}
    	}
    }
    public String toString() {
    	String str = "";
    	for (int i = 0; i < size; i++) {
    		str += list[i].getName() +"," + list[i].getTotal() +"," + list[i].getCaste();
    	}
    	return str.substring(0, str.length() - 1);
    }
}
class Solution {
	Solution () {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sorting r = new Sorting();
		int n = sc.nextInt();
		//System.out.println(n);
		int v = sc.nextInt();
		int un = sc.nextInt();
		int bc = sc.nextInt();
		int scc = sc.nextInt();
		int st = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//System.out.println(n);
		//while(sc.hasNext())
			String line = sc.nextLine();
			//System.out.println(line);
			String[] tokens = sc.nextLine().split(",");
			r.add(new Student(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
				Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), tokens[6]));
		}
		r.sort();
		System.out.println(r);
		//if ("open".equal(getCaste()) && )

	}
}
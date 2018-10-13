import java.util.Scanner;
class Stock implements Comparable<Stock> {
	private String name;
	private float change;
	Stock(final String n, final float c) {
		this.name = n;
		this.change = c;
	}
	public String getName() {
		return this.name;
	}
	public float getChange() {
		return this.change;
	}
	public int compareTo(Stock that) {
		return this.getName().compareTo(that.getName());
		//  else {
		// 	if (this.getChange() > that.getChange()) {
		// 		return 1;
		// 	} else {
		// 		return -1;
		// 	}
		// }

	}
	public String toString() {
		return getName() + " " +getChange();
	}

}
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int iterate = 6 * n;
		int hours = 1;
		while (hours < 7) {
			MinPQ<Stock> minpq = new MinPQ<Stock>(n);
			MaxPQ<Stock> maxpq = new MaxPQ<Stock>(n);
			Stock[] shares = new Stock[n];
			for (int i = 0; i < n; i++) {
				String[] tokens = scan.nextLine().split(",");
				shares[i] = new Stock(tokens[0], Float.parseFloat(tokens[1]));
				System.out.println(shares[i]);
			}
			Float median = shares[0].getChange();
			for (int i =0; i < n; i++) {
				if (shares[i].getChange() > median) {
					 minpq.insert(shares[i]);
				} else {
					maxpq.insert(shares[i]);
				}
			}
			int size = maxpq.size();
			for (int i =0; i < 5; i++) {
				//for (Stock current :maxpq){
				System.out.println(maxpq.max());
				size = maxpq.size() - 1;

			}
			System.out.println();
			for (int i =0; i < 5; i++) {
				System.out.println(minpq.min());
			}
			// for (Stock current :maxpq) {
			// 	System.out.println();
			// }
			hours++;

		}



	}
}
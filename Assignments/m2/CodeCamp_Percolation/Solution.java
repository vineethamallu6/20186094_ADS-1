import java.util.Scanner;
/**
 * Class for percolation.
 */
class Percolation {
	/**
	 * { var_description }
	 */
	private WeightedQuickUnionUF wqf;
	/**
	 * { var_description }
	 */
	private int n;
	/**
	 * { var_description }
	 */
	private int size;
	/**
	 * { var_description }
	 */
	private int first;
	/**
	 * { var_description }
	 */
	private int last;
	/**
	 * { var_description }
	 */
	private boolean[] connected;
	/**
	 * { var_description }
	 */
	private int count;
	/**
	 * Constructs the object.
	 *
	 * @param      n1    The n 1
	 */
	public Percolation(final int n1) {
   	this.n = n1;
   	this.count = 0;
   	this.size = n1 * n1;
   	this.first = size;
   	this.last = size + 1;
   	connected = new boolean[size];
   	wqf = new WeightedQuickUnionUF(size + 2);
   	for (int i = 0; i < n; i++) {
   		wqf.union(first, i);
   		wqf.union(last, size - i - 1);
   	}
   }
   /**
    * Searches for the first match.
    *
    * @param      i     { parameter_description }
    * @param      j     { parameter_description }
    *
    * @return     { description_of_the_return_value }
    */
   public int indexOf(final int i, final int j) {
   		return n * (i - 1) + j - 1;
   }
   /**
    * Links open sites.
    *
    * @param      row   The row
    * @param      col   The col
    */
   private void LinkOpenSites(final int row, final int col) {
   	if (connected[col] && !wqf.connected(row, col)) {
   		wqf.union(row, col);
   	}
   }
   /**
    * { function_description }
    *
    * @return     { description_of_the_return_value }
    */
   public int numberOfOpenSites() {
   	return count;
   }
   /**
    * { function_description }
    *
    * @param      row   The row
    * @param      col   The col
    */
   public void open(final int row, final int col) {
   	int index = indexOf(row, col);
   	connected[index] = true;
   	count++;
   	int bottom = index + n;
   	int top = index - n;
   	if (n == 1) {
   		wqf.union(first, index);
   		wqf.union(last, index);

   	}
   	if (bottom < size) {
   		LinkOpenSites(index, bottom);
   	}
   	if (top >= 0) {
   		LinkOpenSites(index, top);
   	}
   	if(col == 1) {
   		if(col != n) {
   			LinkOpenSites(index, index + 1);
   		}
   		return;
   	} if (col == n) {
   		LinkOpenSites(index, index - 1);
   		return;
   	}
   	LinkOpenSites(index, index + 1);
   	LinkOpenSites(index, index - 1);


   }
   public boolean isOpen(final int row, final int col) {
   	return connected[indexOf(row, col)];
   }
   public boolean percolates() {
   	return wqf.connected(first, last);
   }
}
/**
 * class Solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */

	private Solution() {

	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Percolation p = new Percolation(n);
		while(sc.hasNext()) {
			String [] tokens = sc.nextLine().split(" ");
			p.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		}
		System.out.println(p.percolates() && p.numberOfOpenSites() != 0);

	}
}

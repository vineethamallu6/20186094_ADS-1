import java.util.Scanner;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
    /**
     * { var_description }.
     */
    private String name;
    /**
     * { var_description }.
     */
    private float change;
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      c     { parameter_description }
     */
    Stock(final String n, final float c) {
        this.name = n;
        this.change = c;
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
     * Gets the change.
     *
     * @return     The change.
     */
    public float getChange() {
        return this.change;
    }
    /**
     * { function_description }.
     *
     * @param      that  The that.
     *
     * @return     { description_of_the_return_value }.
     */
    public int compareTo(final Stock that) {
        return this.getName().compareTo(that.getName());
        //  else {
        //  if (this.getChange() > that.getChange()) {
        //      return 1;
        //  } else {
        //      return -1;
        //  }
        // }

    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getName() + " " + getChange();
    }

}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
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
                shares[i] = new Stock(tokens[0],
                    Float.parseFloat(tokens[1]));
                System.out.println(shares[i]);
            }
            Float median = shares[0].getChange();
            for (int i = 0; i < n; i++) {
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
            //  System.out.println();
            // }
            hours++;

        }



    }
}

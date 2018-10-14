
import java.util.Scanner;
public class Taxicab implements Comparable<Taxicab> {
    private final int i;
    private final int j;
    private final long sum;   // i^3 + j^3, cached to avoid recomputation

    // create a new tuple (i, j, i^3 + j^3)
    public Taxicab(int i, int j) {
        this.sum = (long) i*i*i + (long) j*j*j;
        this.i = i;
        this.j = j;
    }

    // compare by i^3 + j^3, breaking ties by i
    public int compareTo(Taxicab that) {
        if      (this.sum < that.sum) return -1;
        else if (this.sum > that.sum) return +1;
        else if (this.i < that.i)     return -1;
        else if (this.i > that.i)     return +1;
        else                          return  0;
    }

    public String toString() {
        return i + "^3 + " + j + "^3";
    }


    public static void main(String[] args) {

        // find a^3 + b^3 = c^3 + d^3, where a, b, c, d <= n
        Scanner scan = new Scanner(System.in);
        String[] n = scan.nextLine().split(" ");
        int n1 = Integer.parseInt(n[0]);
        int n2 = Integer.parseInt(n[1]);
        // initialize priority queue
        MinPQ<Taxicab> pq = new MinPQ<Taxicab>();
        for (int i = 1; i <= 500; i++) {
            pq.insert(new Taxicab(i, i));
        }

        // enumerate sums in ascending order, look for repeated sums
        int run = 1;
        Taxicab prev = new Taxicab(0, 0);
        while (!pq.isEmpty()) {
            Taxicab curr = pq.delMin();

            // current sum is same as previous sum
            if (prev.sum == curr.sum) {
                run++;
                if (run == n2) {
                    System.out.print(prev.sum + " = " + prev);
                    System.out.print(" = " + curr);
                    break;
                }
            }
            else {
                if (run > 1) System.out.println();
                run = 1;
            }
            prev = curr;

            if (curr.j < 500) pq.insert(new Taxicab(curr.i, curr.j + 1));
        }
        if (run > 1) System.out.println();
    }

}
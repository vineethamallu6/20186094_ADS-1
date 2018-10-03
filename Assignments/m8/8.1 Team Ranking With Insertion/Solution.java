import java.util.Scanner;
/**
 * Class for ranking.
 */
class Ranking {
    /**
     * { this is a variable for country }.
     */
    private String name;
    /**
     * this is a variable for no of wins.
     */
    private int wins;
    /**
     * this is a variable for no of losses.
     */
    private int losses;
    /**
     * this is a variable for no of draws.
     */
    private int draws;
    /**
     * Constructs the object.
     *
     * @param      n     country name.
     * @param      w     no of wins.
     * @param      l     no oflosses.
     * @param      d     no of draws.
     */
    Ranking(final String n, final int w, final int l, final int d) {
        this.name = n;
        this.wins = w;
        this.losses = l;
        this.draws = d;
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
     * Gets the wins.
     * time complexity is 1.
     * @return     The wins.
     */
    public int getWins() {
        return this.wins;
    }
    /**
     * Gets the losses.
     * time complexity is 1.
     * @return     The losses.
     */
    public int getLosses() {
        return this.losses;
    }
    /**
     * Gets the draws.
     * time complexity is 1.
     * @return     The draws.
     */
    public int getDraws() {
        return this.draws;
    }
    /**
     * this is a function for comparing.
     * time complexity is 1.
     * @param      that  The that
     *
     * @return     returns value.
     */
    public int compareTo(final Ranking that) {
        if (this.getWins() < that.getWins()) {
            return 1;
        } else if (this.getWins() > that.getWins()) {
            return -1;
        } else {
        if (this.getLosses() < that.getLosses()) {
            return -1;
        } else if (this.getLosses() > that.getLosses()) {
            return 1;
        } else {
            if (this.getDraws() < that.getDraws()) {
                return 1;
            } else if (this.getDraws() > that.getDraws()) {
                return -1;
            }
        }
    }
    return 0;
}
}
/**
 * Class for sorting.
 */
class Sorting {
    /**
     * variable 100.
     */
    private final int hundred = 100;
    /**
     * ranks array.
     */
    private Ranking[] ranks;
    /**
     * size variable.
     */
    private int size;
    /**
     * Constructs the object.
     * time complexity is 1.
     */
    Sorting() {
        ranks = new Ranking[hundred];
        size = 0;
    }
    /**
     * adds the ranking objects
     * time complexity is 1.
     * @param      rank  The rank object.
     */
    public void add(final Ranking rank) {
        ranks[size++] = rank;
    }
    /**
     * this is a function for sorting.
     * time complexity is N^2.
     */
    public void sort() {
        for (int i = 1; i < size; i++) {
            Ranking r = ranks[i];
            int j = i - 1;
            int count = r.compareTo(ranks[j]);
            while (j >= 0 && count == -1) {
                ranks[j + 1] = ranks[j];
                j--;
                if (j >= 0) {
                    count = r.compareTo(ranks[j]);
                }
                ranks[j + 1] = r;
            }
        }
    }
    /**
     * Returns a string representation of the object.
     * time complexity is 1.
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += ranks[i].getName() + ",";
        }
        return s.substring(0, s.length() - 1);
    }
}
/**
 * this is a solution class.
 */
public final class Solution {
    /**
     * Empty Constructor for checkstyle.
     */
    private Solution() {
        //for check style purpose.
    }
    /**
     * client program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting s = new Sorting();
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");
            s.add(new Ranking(tokens[0],
                Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[1 + 2])));
        }
        s.sort();
        System.out.println(s);
    }
}

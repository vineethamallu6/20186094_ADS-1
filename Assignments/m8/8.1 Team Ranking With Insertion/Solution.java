import java.util.Scanner;
class Ranking {
	private String name;
	private int wins;
	private int losses;
	private int draws;
	Ranking (String n, int w, int l, int d) {
		this.name = n;
		this.wins = w;
		this.losses = l;
		this.draws = d;
	}
	public String getName() {
		return this.name;
	}
	public int getWins() {
		return this.wins;
	}
	public int getLosses() {
		return this.losses;
	}
	public int getDraws() {
		return this.draws;
	}
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
class Sorting {
	private final int hundred = 100;
	private Ranking[] ranks;
	private int size;
	Sorting() {
		ranks = new Ranking[hundred];
		size = 0;
	}
	public void add(final Ranking rank) {
		ranks[size++] = rank;
	}
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
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += ranks[i].getName() + ",";
		}
		return s.substring(0, s.length() - 1);
	}
}

public final class Solution {
	/**
     * Empty Constructor for checkstyle.
     */
    private Solution() {
        //for check style purpose.
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Sorting s = new Sorting();
    	while (sc.hasNext()) {
    		String[] tokens = sc.nextLine().split(",");
    		s.add(new Ranking(tokens[0],
    			Integer.parseInt(tokens[1]),
    			Integer.parseInt(tokens[2]),
    			Integer.parseInt(tokens[3])));
    	}
    	s.sort();
    	System.out.println(s);
    }
}

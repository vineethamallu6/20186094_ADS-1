import java.util.Scanner;
/**
 * Solution class for main.
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
        Scanner sc =  new Scanner(System.in);
        Steque s = new Steque();
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0) {
            for (int i = 0; i < n; i++) {

            while (sc.hasNext()) {
                String[] tokens = sc.nextLine().split(" ");
                if (tokens[0].equals("")) {
                    System.out.println();
                }
                switch (tokens[0]) {
                    case "push":
                    s.push(Integer.parseInt(tokens[1]));
                    break;
                    case "pop":
                    s.pop();
                    break;
                    case "enqueue":
                    s.enqueue(Integer.parseInt(tokens[1]));
                    break;
                    default:
                    s = new Steque();
                    break;
                    }
                }
            }
        }

    }
}



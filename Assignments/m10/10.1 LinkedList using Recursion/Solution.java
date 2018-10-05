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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(" ");
            switch (tokens[0]) {
                case "insertAt":
                try {
                list.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                list.display();
            }
            catch (Exception e) {
                System.out.println("Can't insert at this position.");
            }
            break;
            case "reverse":
            try {
            list.reverse();
            list.display();
        }
            catch (Exception e) {
                System.out.println("No elements to reverse.");
            }
                break;
            }

        }
    }
}
import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {
        //for check style purpose.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinearProbingHashST<String, Integer> hash
        = new LinearProbingHashST<String, Integer>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] token = scan.nextLine().split(" ");
            switch (token[0]) {
                case "put":
                hash.put(token[1], Integer.parseInt(token[2]));
                break;
                case "get":
                System.out.println(hash.get(token[1]));
                break;
                case "display":
                try {
                System.out.println(hash.display());
                } catch (Exception ex) {
                    System.out.println("{}");
                }
                break;
                case "delete":
                hash.delete(token[1]);
                break;
                default:
                break;
            }
        }
    }
}

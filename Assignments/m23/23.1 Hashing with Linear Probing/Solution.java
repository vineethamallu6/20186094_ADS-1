import java.util.Scanner;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinearProbingHashST<String, Integer> hash
		= new LinearProbingHashST<String, Integer>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] token = scan.nextLine().split(" ");
			switch(token[0]) {
				case "put":
				hash.put(token[1], Integer.parseInt(token[2]));
				break;
				case "get":
				System.out.println(hash.get(token[1]));
				break;
				case "display":
				System.out.println(hash.display());
				break;
				case "delete":
				hash.delete(token[1]);
				break;
			}
		}
	}
}
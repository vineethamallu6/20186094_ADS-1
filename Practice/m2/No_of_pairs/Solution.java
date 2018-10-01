import java.util.Arrays;
import java.util.Scanner;
class PairCount {
	public int pairCount(int[] array) {
		Arrays.sort(array);
		int count = 0;
		int previous = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] == previous) {
				count++;
			}
			previous = array[i];
		}
		return count;
	}
}

	public class Solution {
	public static void main(String[] args) {
		PairCount p = new PairCount();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] number = new int[n];
		for (int i = 0; i < n; i++) {
			number[i] = s.nextInt();
		}
		System.out.println(p.pairCount(number));

	}
}
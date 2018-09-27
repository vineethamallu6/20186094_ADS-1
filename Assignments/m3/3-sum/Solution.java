import java.util.Scanner;
class ThreeSum
{
	private long[] array;
	private long size;
	public ThreeSum(long size, long[] array) {
		this.size = size;
		this.array = array;
	}
	public long threeSum(long[] array) {
		long n = array.length;
		long count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long [] numbers = new long[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = s.nextLong();
		}
		ThreeSum t = new ThreeSum(n, numbers);
		System.out.println(t.threeSum(numbers));

	}
}
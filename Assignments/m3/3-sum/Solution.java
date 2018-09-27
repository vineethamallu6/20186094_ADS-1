import java.util.Scanner;
class ThreeSum
{
	private int[] array;
	private int size;
	public ThreeSum(int size, int[] array) {
		this.size = size;
		this.array = array;
	}
	public int threeSum(int[] array) {
		int n = array.length;
		int count = 0;
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
		int [] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = s.nextInt();
		}
		ThreeSum t = new ThreeSum(n, numbers);
		System.out.println(t.threeSum(numbers));

	}
}
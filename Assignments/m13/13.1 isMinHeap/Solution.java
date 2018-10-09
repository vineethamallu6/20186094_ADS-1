import java.util.Scanner;
class MinHeap<E extends Comparable<E>>{
	private E[] array;
	MinHeap(E[] arr) {
		this.array = arr;
	}
	public boolean isMinHeap(final E[] arr1) {
		for (int i = 0; i < arr1.length - 1; i++) {
			if (!less(arr1[i], arr1[i + 1])) {
				return false;
			}

		}
		return true;
	}
	public boolean less(final E i, final E j) {
		return i.compareTo(j) <= 0;
	}

}
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		switch(line) {
			case "String":
			int testcases = s.nextInt();
			for (int i = 0; i < testcases; i++) {
				String[] tokens = s.nextLine().split(",");
				MinHeap<String> m = new MinHeap<String>(tokens);
				System.out.println(m.isMinHeap(tokens));

			}
			break;
			case "Integer":
			int tests = s.nextInt();
			for (int i = 0; i < tests; i++) {
				String str = s.nextLine();
				String[] tokens = str.split(",");
				Integer[] intarr = new Integer[tokens.length];
				for (int j = 0; j < tokens.length; j++) {
					intarr[j] = Integer.parseInt(tokens[j]);
				}
				MinHeap<Integer> m = new MinHeap<Integer>(intarr);
				//int len = intarr.length;
				m.isMinHeap(intarr);
			}
			break;
			case "Float":
			int n = Integer.parseInt(s.nextLine());
			for (int i = 0; i < n; i++) {
				String string = s.nextLine();
				if (string.equals("")) {
					System.out.println("false");
				} else {
				String[] tokens= string.split(",");
				Float[]  floarr= new Float[tokens.length];
				for (int j = 0; j < tokens.length; j++) {
					floarr[j] = Float.parseFloat(tokens[j]);
				}
				MinHeap<Float> m = new MinHeap<Float>(floarr);
				//int len = floarr.length;
				System.out.println(m.isMinHeap(floarr));
			}
			}
			break;
			case "Double":
			int cases = Integer.parseInt(s.nextLine());
			for (int i = 0; i < cases; i++) {
				String st = s.nextLine();
				String[] tokens= st.split(",");
				Double[]  douarr = new Double[tokens.length];
				for (int j = 0; j < tokens.length; j++) {
					douarr[j] = Double.parseDouble(tokens[j]);
				}
				MinHeap<Double> m = new MinHeap<Double>(douarr);
				//int len = douarr.length;
				System.out.println( m.isMinHeap(douarr));
			}
			break;
		}
	}
}
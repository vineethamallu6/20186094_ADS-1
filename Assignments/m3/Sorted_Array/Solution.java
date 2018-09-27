import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for sorted array.
 */
class SortedArray {
    /**
     * size1.
     */
    private int size1;
    /**
     * size2.
     */
    private int size2;
    /**
     * array1.
     */
    private int[] array1;
    /**
     * array2.
     */
    private int[] array2;
    /**
     * array3.
     */
    private int[] array3;
    /**
     * Constructs the object.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     */
    SortedArray(final int[] a, final int[] b) {
        this.size1 = a.length;
        this.size2 = b.length;
        this.array1 = a;
        this.array2 = b;
        this.array3 = new int[size1 + size2];
    }
    /**
     * sortArray.
     *
     * @param      a1    A 1
     * @param      b1    The b 1
     *
     * @return     returns sorted array.
     */
    public int[] sortArray(final int[] a1, final int[] b1) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < size1 && j < size2) {
            if (a1[i] < b1[j]) {
                array3[k++] = a1[i++];
            } else {
                array3[k++] = b1[j++];
            }
        }
        while (i < size1) {
            array3[k++] = a1[i++];
        }
        while (j < size2) {
            array3[k++] = b1[j++];
        }
        return array3;
    }
}

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object of solution.
     */
    private Solution() {

    }
    /**
     * main function is here.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        int m = Integer.parseInt(input.next());
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        if (n > 0) {
            String[] tokens = input.next().split(",");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(tokens[i]);
            }
        }
        if (m > 0) {
            String[] token = input.next().split(",");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(token[i]);
            }
        }
        SortedArray s = new SortedArray(arr1, arr2);
        int[] result = s.sortArray(arr1, arr2);
        System.out.println(Arrays.toString(result).substring(
            1, Arrays.toString(result).length() - 1).replace(" ", ""));
    }
}


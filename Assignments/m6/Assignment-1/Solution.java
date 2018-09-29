import java.util.Scanner;
import java.util.*;
import java.math.*;
/**
 * Class for add large numbers.
 */
class AddLargeNumbers {
    /**
     * { var_description }
     */

	static LinkedList<Integer>listNode = new LinkedList<>();
    /**
     * { function_description }
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
	public static LinkedList numberToDigits(String number) {
    	int len = number.length();
    	//BigInteger num = new BigInteger(number);
        for (int i = 0; i < len; i++) {
    		listNode.add(number.charAt(i) - '0');
    	}
        //System.out.println(list1);
        return listNode;
    }
    /**
     * { function_description }
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */

    public static String digitsToNumber(LinkedList list) {
    	int numbers = 0;
    	String str = "";
    	//System.out.println(list.toString());
    	int len = list.size();
    	for (int i = 0; i < len; i++) {
    		numbers = (listNode.get(i));
    		str += Integer.toString(numbers);
    	}
    	return str;
    }

    //public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	//return null;

    //}
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                //System.out.println(AddLargeNumbers.numberToDigits(p));
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            // case "addLargeNumbers":
            //     pDigits = AddLargeNumbers.numberToDigits(p);
            //     qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
    }

}

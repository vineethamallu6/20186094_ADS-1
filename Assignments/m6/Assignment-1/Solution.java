import java.util.Scanner;
import java.util.*;
import java.math.*;
/**
 * Class for add large numbers.
 */
class AddLargeNumbers {
    /**
     * { function_description }
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
	public static LinkedList numberToDigits(String number) {
        LinkedList listNode = new LinkedList ();
    	String[] str = number.split("");
        for (int i =0; i<str.length;i++) {
            listNode.add(str[i]);
        }
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
    	String strings = "";
        String str = "";
        while(!list.isEmpty1()) {
            strings += list.pop1();
        }
        int len = strings.length() -1;
        for (int i = len; i >= 0; i--) {
            str += strings.charAt(i);

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

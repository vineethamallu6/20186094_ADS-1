import java.util.Scanner;
//import java.util.Arrays;
//import java.math.*;
/**
 * Class for add large numbers.
 */
class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    AddLargeNumbers() {

    }
    /**
     * { function_description }.
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList listNode = new LinkedList ();
        //LinkedList<BigInteger> listNode = new LinkedList<> ();
        String[] str = number.split("");
        //System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            listNode.add(str[i]);
        }
        //System.out.println(listNode);
        return listNode;
    }
    /**
     * { function_description }
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */

    public static String digitsToNumber(final LinkedList list) {
        String strings = "";
        String str = "";
        while(!list.isEmpty1()) {
            strings += list.pop1();
        }
       //System.out.println(strings);
        int len = strings.length() -1;
        for (int i = len; i >= 0; i--) {
            str += strings.charAt(i);

        }
        //System.out.println(str);
        return str;
    }

    //public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        //return null;

    //}
}

public class Solution {
    public static void main(final String[] args) {
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
            //     LinkedList result = AddLargeNumbers.AddLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
    }

}


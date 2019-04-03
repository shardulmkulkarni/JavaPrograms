package tayari;

import java.util.Scanner;

/**
 * 
 * @author shardulkulkarni
 * Print true/false in case given string is palindrome.
 * 
 *
 */

public class palindromeExample {

    public static void main(String args[]) {

        String original, reverse = "";
        boolean flag = true;

        System.out.println("Enter number or string to check");
        Scanner in = new Scanner(System.in);

        original = in.nextLine();
        in.close();


        int length = original.length();
        System.out.println(length);

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

//            if (original.equals(reverse))
//                System.out.println("Its palindrome");
//
//            else
//                System.out.println("Its not palindrome");

        
        // without using equals method
        for (int j = 0; j <= length - 1; j++) {
            if (original.charAt(j) == reverse.charAt(j)) {

                continue;
            } else {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("true");
        else
            System.out.println("false");

    }


}
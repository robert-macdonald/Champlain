package sem2.chap8;

import java.util.Scanner;

/**
 * Created by robert on 2/22/17.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string");
        String s = input.next();
        String sReversed = "";
        for (int i = s.length() - 1; i > -1; i--) {
            sReversed += s.charAt(i);
        }
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + sReversed);
    }
}

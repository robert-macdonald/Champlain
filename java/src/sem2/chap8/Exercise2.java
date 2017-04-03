package sem2.chap8;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by robert on 2/22/17.
 */
public class Exercise2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input words..");
        String s = input.nextLine();
        StringTokenizer strT = new StringTokenizer(s);
        System.out.println(strT.countTokens());
    }
}

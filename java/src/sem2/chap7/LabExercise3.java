package sem2.chap7;

import java.util.Scanner;

/**
 * Created by robert on 1/25/17.
 */
public class LabExercise3 {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("input a word");
        System.out.println(isPalindrome(input.next()));
    }
}

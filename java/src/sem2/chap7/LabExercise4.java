package sem2.chap7;

import java.util.Scanner;

/**
 * Created by robert on 1/25/17.
 */
public class LabExercise4 {
    public static String isValid(String password){
        if (password.length() < 8) {
            return "Invalid";
        } else {
            char c;
            int count = 0;
            for (int i = 0; i < password.length(); i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return "Invalid";
                } else if (Character.isDigit(c)) {
                    count++;
                }
            }
            if (count < 2)   {
                return "Invalid";
            }
        }
        return "Valid";
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("input password");
        System.out.println(isValid(input.next()));
    }
}

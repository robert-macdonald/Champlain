package sem2.chap7;

import java.util.Scanner;

public class LabExercise2 {

    private static int reverse(int input) {
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return (int)reversedNum;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int rev = input.nextInt();
        System.out.println(reverse(rev));
    }
}

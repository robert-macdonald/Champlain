package sem2.chap7;

import java.util.Scanner;

/**
 * Created by robert on 1/25/17.
 */
public class LabExercise1 {

    public static int sumDigits(long n){
        int sum = 0;
        int number;
        while(n % 10 != 0){
            number = (int) n % 10;
            sum += number;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        System.out.println(sumDigits(input.nextLong()));
    }
}

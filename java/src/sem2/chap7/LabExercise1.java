package sem2.chap7;

import java.util.Scanner;

public class LabExercise1 {

    private static int sumDigits(long n){
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

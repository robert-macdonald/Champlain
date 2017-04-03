package sem2.chap7; /**
 * Created by robert on 1/23/17.
 */

import java.util.Scanner;
public class Exercise4 {
    public static void larger(int num, int[] arr){

        for(int x = 0; x < arr.length; x++){
            if(num < arr[x]) {
                System.out.println(arr[x]);
            }
        }

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number");
        int inp = input.nextInt();
        int[] numArray = {5,10,15,20,25,30,35};
        larger(inp, numArray);
    }
}

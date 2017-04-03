package sem2.chap8;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by robert on 2/22/17.
 */
public class Excercise8 {
    public static void main(String args[]){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input numbers");
        String numList = input.nextLine();
        StringTokenizer str = new StringTokenizer(numList, ",");
        while (str.hasMoreTokens()){
            sum += Integer.parseInt(str.nextToken());
        }
        System.out.println(sum);
    }
}

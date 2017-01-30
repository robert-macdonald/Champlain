package sem2.chap7;

import java.util.Scanner;

/**
 * Created by robert on 1/30/17.
 */
public class Exercise16 {

    private static int getTotal(int[][] arr) {
        int sum = 0;
        for (int[] a : arr) {
            for (int anAnArray2d : a) {
                sum = sum + anAnArray2d;
            }
        }
        return sum;
    }

    private static int getAverage(int[][] arr){
        int sum = 0;
        int avg;
        for (int[] a : arr) {
            for (int anAnArray2d : a) {
                sum = sum + anAnArray2d;
            }
        }
        avg = sum / (arr.length + arr[0].length);
        return avg;
    }

    private static int getRowTotal(int[][] arr, int n){
        int sum = 0;
        for(int i = 0; i < arr[n].length; i++){
            sum += arr[n][i];
        }
        return sum;
    }

    private static int getColumnTotal(int[][] arr, int n){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][n];
        }
        return sum;
    }

    private static int getRowHighest(int[][] arr, int n){
        int max = arr[n][0];
        for(int i = 0; i < arr[n].length; i++){
            for(int x = 0; x < arr[n].length; x++){
                if(arr[n][x] > arr[n][i]){
                    max = arr[n][x];
                }
            }
        }
        return max;
    }

    private static int getRowLowest(int[][] arr, int n){
        int min = arr[n][0];
        for(int i = 0; i < arr[n].length; i++){
            for(int x = 0; x < arr[n].length; x++){
                if(arr[n][i] > arr[n][x]){
                    min = arr[n][x];
                }
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[][] = {{1, 2, 3}, {1, 2, 3}};
        System.out.println("Total: " + getTotal(arr) + "\nAverage: " + getAverage(arr));
        System.out.println("What row?");
        System.out.println("Row total: " + getRowTotal(arr, input.nextInt()));
        System.out.println("What column?");
        System.out.println("Column total: " + getColumnTotal(arr, input.nextInt()));
        System.out.println("What row?");
        System.out.println("Row highest: " + getRowHighest(arr, input.nextInt()));
        System.out.println("What row?");
        System.out.println("Row lowest: " + getRowLowest(arr, input.nextInt()));
    }
}

package sem2.chap7;

/**
 * Lets say this class name is ArrayOperations...
 */
public class Exercise11 {

    public static int getTotal(int[] arr){

        int sum = 0;
        for (int x =0; x < arr.length; x++){
            sum += arr[x];
        }
        return sum;
    }

    public static int getAverage(int[] arr){
        int avg = 0;
        int sum = 0;
        for (int x =0; x < arr.length; x++){
            sum += arr[x];
            avg = sum/arr.length;
        }
        return avg;
    }

    public static int getHighest(int[] arr){

        int max = arr[0];
        for (int x = 0; x < arr.length; x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }

    public static int getLowest(int[] arr){

        int min = arr[0];
        for(int x = 0; x < arr.length; x++){
            if(arr[x] < min){
                min = arr[x];
            }
        }
        return min;
    }

    public static void main(String args[]){

        int[] arr = {3,7,12,16,22,90};
        System.out.println(getTotal(arr) + " " + getAverage(arr) + " " + getHighest(arr) + " " + getLowest(arr));

    }

}

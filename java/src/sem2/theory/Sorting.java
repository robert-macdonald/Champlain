package sem2.theory;

public class Sorting {
    public static int[] sortedArray(int[] arr){
        for (int i = arr.length; i >= 0; i--){
            for (int j = 0; j < arr.length - 1; j++){
                int k = j + 1;
                if (arr[j] < arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }

        quickSort(inputArr, 0, inputArr.length - 1);
    }

    private static void quickSort(int[] arr, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = arr[lowerIndex + ((int) Math.floor((higherIndex-lowerIndex) / 2))];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(arr, i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(arr, lowerIndex, j);
        if (i < higherIndex)
            quickSort(arr, i, higherIndex);
    }

    private static void exchangeNumbers(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){
        int[] arr = {12, 2, 6, 22, 15, 4};
        sort(arr);
        printArray(arr);
    }
}
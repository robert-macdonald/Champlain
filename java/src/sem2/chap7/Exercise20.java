package sem2.chap7;

/**
 * Created by robert on 1/30/17.
 */
public class Exercise20 {
    private static boolean getRows(int[][] arr) {
        int firstRow = 0;
        int secondRow = 0;
        int thirdRow = 0;
        for (int i = 0; i < arr[0].length; i++) {
            firstRow += arr[i][0];
            secondRow += arr[i][1];
            thirdRow += arr[i][2];
        }
        return firstRow == secondRow && firstRow == thirdRow;
    }

    private static boolean getColumns(int[][] arr) {
        int firstColumn = 0;
        int secondColumn = 0;
        int thirdColumn = 0;
        for (int i = 0; i < arr.length; i++) {
            firstColumn += arr[0][i];
            secondColumn += arr[1][i];
            thirdColumn += arr[2][i];
        }
        return firstColumn == secondColumn && firstColumn == thirdColumn;
    }

    private static boolean getDiagonal(int[][] arr) {
        int firstDiagonal = arr[0][0] + arr[1][1] + arr[2][2];
        int secondDiagonal = arr[2][0] + arr[1][1] + arr[0][2];
        return firstDiagonal == secondDiagonal;
    }

    private static boolean checkUnique(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int num = arr[row][col];
                for (int otherCol = col + 1; otherCol < arr.length; otherCol++) {
                    if (num == arr[row][otherCol]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isMagicSquare(int[][] arr) {
        return getRows(arr) && getColumns(arr) && getDiagonal(arr) && checkUnique(arr);
    }

    public static void main(String args[]) {
        int[][] arr = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        System.out.println("Is this a magic square?");
        System.out.println(isMagicSquare(arr));
    }
}

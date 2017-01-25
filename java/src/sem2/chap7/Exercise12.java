package sem2.chap7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise12 {

    private ArrayList<Integer> arr = new ArrayList<>();

    private Exercise12(String fileName) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("data/"+fileName));
        while (reader.hasNext()) {
            int i = reader.nextInt();
            arr.add(i);
        }
    }

    private int getTotal(){
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    private int getAverage(){
        int sum = 0;
        int avg = 0;
        for(int i : arr){
            sum += i;
            avg = sum/arr.size();
        }
        return avg;
    }

    private int getHighest(){
        int max = arr.get(0);
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }

    private int getLowest(){
        int min = arr.get(0);
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name");
        String fileName = input.next();
        Exercise12 file = null;
        try {
            file = new Exercise12(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (file != null) {
            System.out.println("Total: " + file.getTotal() + "\nAverage: " + file.getAverage() + "\nHighest: " +
            file.getHighest() + "\nLowest: " + file.getLowest());
        }
    }

}

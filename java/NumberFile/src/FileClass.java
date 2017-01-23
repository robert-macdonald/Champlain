/**
 * Created by robert on 1/23/17.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileClass {

    private String fileName;
    ArrayList<Integer> arr = new ArrayList<Integer>();

    public FileClass(String fileName) throws FileNotFoundException {

        int count = 0;
        this.fileName = fileName;
        Scanner reader = new Scanner(new File(fileName));
        while (reader.hasNext()){
            int i = reader.nextInt();
            arr.add(i);
            count++;
        }
    }

    public int getTotal(){
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int getAverage(){
        int sum = 0;
        int avg = 0;
        for(int i : arr){
            sum += i;
            avg = sum/arr.size();
        }
        return avg;
    }

    public int getHighest(){
        int max = arr.get(0);
        for (int x = 0;  x < arr.size(); x++){
            if (arr.get(x) > max)
                max = arr.get(x);
        }
        return max;
    }

    public int getLowest(){
        int min = arr.get(0);
        for (int x = 0; x < arr.size(); x++){
            if (arr.get(x) < min)
                min = arr.get(x);
        }
        return min;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name");
        String fileName = input.next();
        FileClass file = null;
        try {
            file = new FileClass(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Total: " + file.getTotal() + "\nAverage: " + file.getAverage() + "\nHighest: " +
        file.getHighest() + "\nLowest: " + file.getLowest());
    }

}

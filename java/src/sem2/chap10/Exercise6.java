package sem2.chap10;

import java.io.*;

public class Exercise6 {

    private static BufferedWriter bw = null;
    private static FileWriter fw = null;

    public static void writeArray(String filename, int[] intArr) {
        try {
            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < intArr.length; i++) {
                bw.write(Integer.toString(intArr[i]));
                bw.newLine();
            }
            System.out.println("Wrote to file! \n");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException ex){
            System.out.println("Error to writing file: " + filename);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + filename);
            }
        }
    }

    public static void readArray(String filename, int[] intArr) {
        try {

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int num;
            int i = 0;

            while ((line = br.readLine()) != null) {
                num = Integer.parseInt(line);
                intArr[i] = num;
                i++;
            }
            for (int x = 0; x < intArr.length; x++){
                System.out.println("Num " + (x+1) + " " + intArr[x]);
            }
            System.out.println("\nDone Reading!");

            fr.close();
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException ex){
            System.out.println("Error reading file: " + filename);
        }
    }

    public static void main(String args[]){
        String filename = "intArray.txt";
        int[] intArr = {1,2,3,4,5,6,7,8,9};
        int[] intArr2 = new int[9];
        writeArray(filename, intArr);
        readArray(filename, intArr2);
    }
}

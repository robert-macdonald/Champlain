package sem2.chap10;

import java.io.*;

public class Exercise8 {

    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static FileReader fr = null;
    private static BufferedReader br = null;

    @SuppressWarnings("Duplicates")
    public static void decryptFile(String filename){
        try {

            fw = new FileWriter("Decrypted.txt");
            bw = new BufferedWriter(fw);

            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String line;
            String decrypted = "";

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {

                    char current = line.charAt(i);
                    int ascii = (int) current;

                    ascii -= 5;

                    decrypted += (char) ascii;
                }
                bw.write(decrypted);
                bw.newLine();
            }

            System.out.println("Decrypted the file!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException ex) {
            System.out.println("Error with file: " + filename);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + filename);
            }
        }
    }

    public static void main(String args[]) {
        decryptFile("Encrypted.txt");
    }

}

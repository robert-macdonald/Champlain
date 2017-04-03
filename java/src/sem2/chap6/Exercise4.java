package sem2.chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {

    private int length;
    private int width;

    public Exercise4(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercise4 exercise4 = (Exercise4) o;

        if (length != exercise4.length) return false;
        return width == exercise4.width;
    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "area = " + getArea();
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("How many tracks will you input?");
        int cap = input.nextInt();
        ArrayList<Exercise4> trackList = new ArrayList<>(cap);

        int length;
        int width;
        for (int i = 0; i < cap; i++){
            System.out.println("Track length " + (i +1) + ": ");
            length = input.nextInt();
            System.out.println("Track width " + (i +1) + ": ");
            width = input.nextInt();
            trackList.add(new Exercise4(length, width));
        }

        for (int x = 0; x < trackList.size(); x++){
            System.out.println("Track " + (x + 1) + " " + trackList.get(x).toString());
            for (int j = 0; j < trackList.size(); j++) {
                System.out.println("Equal to previous: " + trackList.get(x).equals(trackList.get(j)));
            }
        }
    }
}
package sem2.chap6;

import java.util.Scanner;

public class Exercise1 {
    public static double getArea(double r){
        return Math.round(Math.PI * (r * r));
    }
    public static double getArea(int w, int l){
        return Math.round(w * l);
    }
    public static double getArea(double r, double h){
        return Math.round((2 * Math.PI * r * h) + (2 * Math.PI * (r * r)));
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of circle?");
        System.out.println("A = " + getArea(input.nextDouble()));
        System.out.println("Width and length?");
        System.out.println("A = " + getArea(input.nextInt(), input.nextInt()));
        System.out.println("Radius of cylinder and height?");
        System.out.println("A = " + getArea(input.nextDouble(), input.nextDouble()));
    }
}
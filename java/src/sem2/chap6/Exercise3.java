package sem2.chap6;

public class Exercise3 {
    private double length;
    private double width;

    public Exercise3(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getCost(int cost){
        return getArea() * cost;
    }
}
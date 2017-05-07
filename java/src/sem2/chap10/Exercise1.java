package sem2.chap10;

public class Exercise1 {

    public static double getAverage(double[] testScores){
        double avg = 0;
        for (int i = 0; i < testScores.length; i++){
            if (testScores[i] > 0){
                avg += testScores[i];
            }
            if (testScores[i] > 100 || testScores[i] < 0) {
                throw new IllegalArgumentException("Invalid number in array!");
            }
        }
        return avg /= testScores.length;
    }

    public static void main(String args[]){
        double[] numbers = {80, 101, 90, 66, 23, 65};
        try{
            System.out.print(Exercise1.getAverage(numbers));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
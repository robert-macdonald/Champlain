package sem2.chap9;

import java.util.Scanner;

//make as if this class was named Employee
public class Exercise1p1 {

    private String name;
    private String employeeNum;
    private String hireDate;

    public void setEmployeeNum(String employeeNumber){
        String finalNumbers = "";
        if (employeeNumber.length() != 4){
            System.out.println("Invalid string length");
        } else {
            for(int i = 0; i < 3; i++){
                if(Character.isDigit(employeeNumber.charAt(i))){
                    finalNumbers += employeeNumber.charAt(i);
                } else {
                    System.out.println("Invalid number");
                    finalNumbers = "";
                    break;
                }
            }
            if(finalNumbers.length() == 3){
                if(Character.isLetter(employeeNumber.charAt(3))){
                    finalNumbers += "-" + Character.toUpperCase(employeeNumber.charAt(3));
                }
            }
        }
        employeeNum = finalNumbers;
    }
    public String getEmployeeNum() {
        return employeeNum;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Exercise1p1 e1 = new Exercise1p1();

        e1.setEmployeeNum(input.nextLine());
        System.out.println(e1.getEmployeeNum());
    }
}

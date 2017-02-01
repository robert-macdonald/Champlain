package sem2.chap7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robert on 2/1/17.
 */
public class Exercise18 {
    private String name;
    private String phoneNumber;

    private Exercise18(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private void setName(String name){
        this.name = name;
    }
    private void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    private String getName(){
        return name;
    }
    private String getPhoneNumber(){
        return phoneNumber;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<Exercise18> addressBook = new ArrayList<>(5);
        String name;
        String phoneNumber;
        for (int i = 0; i < 5; i++){
            System.out.println("Input name");
            name = input.next();
            System.out.println("Input phone number");
            phoneNumber = input.next();
            addressBook.add(new Exercise18(name, phoneNumber));
        }
        for (int x = 0; x < addressBook.size(); x++){
            System.out.println("Name: " + addressBook.get(x).getName() + "\nPhone number: " + addressBook.get(x).getPhoneNumber());
        }
    }
}

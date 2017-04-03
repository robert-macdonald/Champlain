package sem2.chap9;

import java.util.ArrayList;
import java.util.Scanner;

//customer
public class Exercise7p2 extends Exercise7 {
    private int customerNumber;
    private boolean mailList;

    public Exercise7p2(String name, String address, String phoneNumber, int customerNumber, boolean mailList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailList = mailList;
    }
    public Exercise7p2() {
        super();
        this.customerNumber = 0;
        this.mailList = false;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }
    public boolean isMailList() {
        return mailList;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Customer Number: " + getCustomerNumber() + "\n" +
                "Mail List: " + isMailList();
    }

    public static void main(String args[]){
        ArrayList<Exercise7p2> cusList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int x = 0;
        int cap = input.nextInt();
        while (x < cap) {
            System.out.println("name");
            String name = input.nextLine();
            System.out.println("address");
            String address = input.nextLine();
            System.out.println("phone");
            String phone = input.nextLine();
            System.out.println("customer number");
            int custNum = input.nextInt();
            System.out.println("mail list true/false");
            boolean mail = input.nextBoolean();
            cusList.add(new Exercise7p2(name, address, phone, custNum, mail));
            x++;
        }
        for (int i = 0; i < cusList.size(); i++) {
            System.out.println("\n" + cusList.get(i).toString());
        }
    }
}

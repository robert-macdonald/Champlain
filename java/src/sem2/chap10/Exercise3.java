package sem2.chap10;

import java.util.Scanner;

public class Exercise3 {

    private int amountOnHand;
    private int price;

    public Exercise3(int amountOnHand, int price) throws NegativePriceException, InvalidAmountException {
        if (amountOnHand < 0) {
            throw new InvalidAmountException();
        } else {
            this.amountOnHand = amountOnHand;
        }
        if (price < 0) {
            throw new NegativePriceException();
        } else {
            this.price = price;
        }
    }

    public void setAmountOnHand(int amountOnHand) {
        this.amountOnHand = amountOnHand;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountOnHand() {
        return amountOnHand;
    }
    public int getPrice() {
        return price;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("How many items do you have on hand?");
            int amountOnHand = input.nextInt();
            System.out.println("How much is this item?");
            int price = input.nextInt();
            Exercise3 item = new Exercise3(amountOnHand, price);
        } catch (InvalidAmountException | NegativePriceException i) {
            System.out.println(i.getMessage());
        }
    }
}

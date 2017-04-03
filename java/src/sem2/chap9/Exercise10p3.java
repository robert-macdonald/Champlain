package sem2.chap9;

import java.util.Scanner;

public class Exercise10p3 extends Exercise10 {
    private int cargoTonneCap;

    public Exercise10p3(int cargoTonneCap) {
        this.cargoTonneCap = cargoTonneCap;
    }

    public Exercise10p3(String name, String year, int cargoTonneCap) {
        super(name, year);
        this.cargoTonneCap = cargoTonneCap;
    }

    public Exercise10p3() {
        super();
        this.cargoTonneCap = 0;
    }

    public int getCargoTonneCap() {
        return cargoTonneCap;
    }

    public void setCargoTonneCap(int cargoTonneCap) {
        this.cargoTonneCap = cargoTonneCap;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Max Cargo in Tonnes: " + cargoTonneCap;
    }

    public static void main(String args[]){
        Exercise10[] ships = new Exercise10[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            while (ships[i] == null){
                int shipType;
                System.out.println("What are you making? Ship(1)/Cruise(2)/Cargo(3)");
                shipType = input.nextInt();
                if (shipType == 1){
                    ships[i] = new Exercise10();
                    System.out.println("Name?");
                    ships[i].setName(input.next());
                    System.out.println("Year?");
                    ships[i].setYear(input.next());
                } else if (shipType == 2){
                    System.out.println("Name?");
                    String name = input.next();
                    System.out.println("Year?");
                    String year = input.next();
                    System.out.println("Max Passengers?");
                    int maxPass = input.nextInt();
                    ships[i] = new Exercise10p2(name,year,maxPass);
                } else if (shipType == 3){
                    System.out.println("Name / Year / MaxCargo?");
                    Exercise10 cargo = new Exercise10p3(input.next(), input.next(), input.nextInt());
                    ships[i] = cargo;
                } else {
                    System.out.println("Invalid ShipType");
                    shipType = input.nextInt();
                }
            }
        }
        for (int x = 0; x < ships.length; x++){
            System.out.println(ships[x].toString());
        }
    }
}

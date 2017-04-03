package sem2.chap9;

public class Exercise10p2 extends Exercise10 {
    private int maxPassenger;

    public Exercise10p2(String name, String year, int maxPassenger) {
        super(name, year);
        this.maxPassenger = maxPassenger;
    }

    public Exercise10p2() {
        super();
        this.maxPassenger = 0;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Max Passenger: " + maxPassenger;
    }
}

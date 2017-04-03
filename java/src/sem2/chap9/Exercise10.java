package sem2.chap9;

public class Exercise10 {
    private String name;
    private String year;

    public Exercise10() {
        name = "";
        year = "0";
    }

    public Exercise10(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Year: " + year;
    }
}
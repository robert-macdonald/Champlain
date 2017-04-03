package sem2.chap6;

public class Exercise6 {
    private String name;
    private String department;
    private String position;
    private int idNumber;

    public Exercise6(String name, String department, String position, int idNumber) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.idNumber = idNumber;
    }
    public Exercise6(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    public Exercise6() {
        this.name = "";
        this.department = "";
        this.position = "";
        this.idNumber = 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", idNumber=" + idNumber;
    }
}
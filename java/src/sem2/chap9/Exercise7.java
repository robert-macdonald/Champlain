package sem2.chap9;

//person
public class Exercise7 {
    private String name;
    private String address;
    private String phoneNumber;

    public Exercise7() {
        name = "John";
        address = "123 Sesame Street";
        phoneNumber = "555-555-5555";
    }
    public Exercise7(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Exercise7(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

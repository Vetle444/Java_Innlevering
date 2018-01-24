package Modul1;

public class Person {

    private String name, address, email, phoneNumber;

    public Person() {

    }

    public Person(String name, String address, String email, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString () {
        return "Person: \n"+String.format("Name: %s \nAddress: %s \nPhone number: %s \nEmail: %s \n", name, address, phoneNumber, email);
    }
}

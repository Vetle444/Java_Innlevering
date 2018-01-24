package Modul1;

public class Staff extends Employee{

    private String title;

    public Staff(String title, double salary, String name, String address, String phoneNumber, String email) {
        super(salary, name, address, phoneNumber, email);

        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: \n"+String.format("Title: %s \nDate hired: %tF %<tT.%<tl \nSalary: %.0f \nName: %s \nAddress: %s \nPhone number: %s \nEmail: %s \n", title, super.getEmployedDate(), super.getSalary(), super.getName(), super.getAddress(), super.getEmail(), super.getPhoneNumber());
    }

}

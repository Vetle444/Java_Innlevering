package Modul1;

import java.util.GregorianCalendar;

public class Employee extends Person{

    private GregorianCalendar employedDate;
    private double salary;

    public Employee (double salary, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);

        this.salary = salary;
        employedDate = new GregorianCalendar();
    }

    public GregorianCalendar getEmployedDate() {
        return employedDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployedDate(GregorianCalendar employedDate) {
        this.employedDate = employedDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: \n"+String.format("Date hired: %tF %<tT.%<tl \nSalary: %.0f \nName: %s \nAddress: %s \nPhone number: %s \nEmail: %s \n", employedDate, salary, super.getName(), super.getAddress(), super.getPhoneNumber(), super.getEmail());
    }
}

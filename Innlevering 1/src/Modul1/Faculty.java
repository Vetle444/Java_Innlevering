package Modul1;

public class Faculty extends Employee{

    private String officeNumber;
    public static final int LECTURER = 0, ASSISTANT_PROFESSOR = 1, PROFESSOR = 2, UNIVERSITY_PROFESSOR = 3;
    private int rank;

    public Faculty (String officeNumber, double salary, int rank, String name, String address, String phoneNumber, String email) {
        super(salary, name, address, phoneNumber, email);

        this.officeNumber = officeNumber;
        this.rank = rank;
    }

    private String getRankAsString(int rank) {
        switch(rank) {
            case LECTURER:
                return "Lecturer";
            case ASSISTANT_PROFESSOR:
                return "Assistant Professor";
            case PROFESSOR:
                return "Professor";
            case UNIVERSITY_PROFESSOR:
                return "University Professor";

            default:
                return "No such rank exists";
        }
    }

    @Override
    public String toString() {
        return "Employee: \n"+String.format("Office: %s \nRank: %s\nDate hired: %tF %<tT.%<tl \nSalary: %.0f \nName: %s \nAddress: %s \nPhone number: %s \nEmail: %s \n", officeNumber, getRankAsString(rank), super.getEmployedDate(), super.getSalary(), super.getName(), super.getAddress(), super.getEmail(), super.getPhoneNumber());
    }
}

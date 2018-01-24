package Modul1;

public class Student extends Person{

    private int whichYear;
    public static final int COMPUTER_SCIENCE = 0, HISTORY = 1, PHYSICS = 2, ENGLISH = 3;

    private int whatCourse;

    public Student(int whichYear, int whatCourse, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);

        this.whichYear = whichYear;
        this.whatCourse = whatCourse;
    }

    private String getCourseAsString(int course) {

        switch(course){

            case COMPUTER_SCIENCE:
                return "Computer Science";
            case HISTORY:
                return "History";
            case PHYSICS:
                return "Physics";
            case ENGLISH:
                return "English";

            default:
                return "No such course exists";

        }
    }

    @Override
    public String toString () {
        return "Student: \n"+String.format("Year: %o \nCourse: %s \nName: %s \nAddress: %s \nPhone number: %s \nEmail: %s \n", whichYear, getCourseAsString(whatCourse), super.getName(), super.getAddress(), super.getEmail(), super.getPhoneNumber());
    }

}

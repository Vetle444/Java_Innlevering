package Modul1;

public class Person_Test {
    public static void main(String[] args) {

        Student student = new Student(1, Student.COMPUTER_SCIENCE, "Vetle", "Bodøveien 2", "99560675", "vetle_pro@live.no");
        System.out.println(student.toString());

        Faculty faculty = new Faculty("C3350", 10000, Faculty.LECTURER, "Jonny", "Mørkvedveien 1337", "95560866", "jonny_cool@live.no");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Cleaner", 100333, "Håkon", "Bodøveien 392", "91474344", "cool@gmail.com");
        System.out.println(staff.toString());

        

    }

}

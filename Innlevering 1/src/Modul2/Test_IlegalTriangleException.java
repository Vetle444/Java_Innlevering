package Modul2;

public class Test_IlegalTriangleException {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1.5, 2, 3);
            Triangle t2 = new Triangle(1, 2, 3);
            Triangle t3 = new Triangle(-1.5, 2, 3);
        } catch (IllegalTriangleException e) {
        }


    }
}

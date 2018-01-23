package Modul1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle_Test {

    public static void main(String[] args) {
        System.out.println("Input length of all three sides: ");

        Scanner scanner = new Scanner(System.in);

        GeometricObject triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), "Red", true);

        System.out.println(String.format("\nSide 1? %.2f \nSide 2? %4.2f \nSide 3? %4.2f \n", ((Triangle)triangle).getSide1() , ((Triangle)triangle).getSide2(), ((Triangle)triangle).getSide3()));

        System.out.println(String.format("Area: %.2f", ((Triangle)triangle).getArea()));
        System.out.println(String.format("Perimeter: %.2f", ((Triangle)triangle).getPerimeter()));

        System.out.println("\n"+((Triangle)triangle).toString());

    }



}

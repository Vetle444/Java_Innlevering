package Modul1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle_Test {

    public static void main(String[] args) {
        System.out.println("Input length of all three sides: ");

        Scanner scanner = new Scanner(System.in);

        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), "Red", true);

        System.out.println(String.format("\nSide 1? %.2f \nSide 2? %4.2f \nSide 3? %4.2f \n", triangle.getSide1() , triangle.getSide2(), triangle.getSide3()));

        System.out.println(String.format("Area: %.2f", triangle.getArea()));
        System.out.println(String.format("Perimeter: %.2f", triangle.getPerimeter()));

        System.out.println("\n"+triangle.toString());



    }

}

package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        double radius = 10;

        double diameter = 2 * radius;
        double area = radius * radius * PI;
        double perimeter = PI * diameter;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}

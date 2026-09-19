import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        double pie = 3.14159;
        double diameter = (2 * radius);
        double circumference = (2 * pie * radius);
        double area = (pie * radius * radius);

        System.out.printf("Diameter = %.2f%n", diameter);
        System.out.printf("Circumference = %.2f%n", circumference);
        System.out.printf("Area = %.2f%n", area);
    }
}

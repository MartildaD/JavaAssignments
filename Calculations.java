import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        int average = (num1 + num2 + num3) / 3;

        System.out.printf("Sum is: %d, Product is: %d, Average is: %d.\n", sum, product, average);
    }
}

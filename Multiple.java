import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numberOne = input.nextInt();
        int tripled = numberOne * 3;

        System.out.println("Enter the Second Number: ");
        int numberTwo = input.nextInt();
        int doubled = numberTwo * 2;

        if (tripled % doubled == 0) {
            System.out.println("The first number is a multiple of the second number");
        } else if (tripled % doubled != 0) {
            System.out.println("The first number is not a multiple of the second number");
        }
    }
}

import java.util.Scanner;

public class Lengths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter acceleration: ");
        int acceleration = input.nextInt();

        System.out.println("Enter Speed: ");
        float speed = input.nextFloat();

        System.out.println("The length is " + ((speed * speed) / (2 * acceleration)));
    }
}

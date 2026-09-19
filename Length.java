import java.util.Scanner;

public class Length {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = input.nextInt();

        if (length < 5) {
            System.out.println("Short String");
        }
        else
            if (length >= 5) {
                System.out.println("medium String");
            }
            else
                if (length > 10) {
                    System.out.println("long String");
                }
    }
}

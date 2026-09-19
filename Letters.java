import java.util.Scanner;

public class Letters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-letter word: ");
        String letter = input.nextLine();

        if (letter.charAt(0) == letter.charAt(2)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a color: ");
        String color = input.nextLine();

        switch (color) {
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
            case "Red":
                System.out.println("Stop");
        }
    }
}

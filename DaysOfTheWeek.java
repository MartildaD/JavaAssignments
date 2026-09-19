import java.util.Scanner;
    public class DaysOfTheWeek{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int numberofdays = input.nextInt();

        switch (numberofdays % 7) {
            case 6: System.out.println("The day wiil be wednesday"); break;
            case 5: System.out.println("The day wiil be Tuesday"); break;
            case 4: System.out.println("The day wiil be Monday"); break;
            case 3: System.out.println("The day wiil be Sunday"); break;
            case 2: System.out.println("The day wiil be Saturday"); break;
            case 1: System.out.println("The day wiil be Friday"); break;
            case 0: System.out.println("The day wiil be Thursday"); break;
            
            default: System.out.println("you dey go na");

}
}
}

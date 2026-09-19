import java.util.Scanner;
public class Lcm{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");
int number1 = input.nextInt();

System.out.print("Enter second number: ");
int number2 = input.nextInt();

int lcm = (number1 > number2)? number1:number2;
while(true){
    if(lcm  % number1 == 0 && lcm % number2 == 0){

System.out.println("lcm is: " + lcm);
    break;
}
        ++lcm;
}
}
}

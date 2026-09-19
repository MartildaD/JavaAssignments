import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
long number = input.nextLong();

long factorial = 1;
for(long index = 1; index <= number; index++){
factorial = factorial * index;
System.out.print(factorial + " ");
}
}
}



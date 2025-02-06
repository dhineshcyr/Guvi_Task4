package task4;
import java.util.Scanner;

public class Question6 {
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    long factorial = 1;
    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + num + " is " + factorial);
}
}
//output
//Enter a number: 6
//Factorial of 6 is 720
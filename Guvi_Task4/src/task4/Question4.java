package task4;
	//Zenclass Task-4 Question number-4
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

	}

}

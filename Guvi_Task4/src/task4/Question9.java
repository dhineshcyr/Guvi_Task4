package task4;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=scanner.nextInt();

        if (age>= 60) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }
	}

}
//output
//Enter age: 27
//The person is not a senior citizen.

//Enter age: 61
//The person is a senior citizen.

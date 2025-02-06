package task4;
import java.util.Scanner;
public class Question10 {
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        int count = 0;
	        while (num != 0) {
	            num /= 10;
	             count++;
	        }

	        System.out.println("The number of digits is: " + count);
	}

}
//output
//Enter a number: 6
//The number of digits is: 1
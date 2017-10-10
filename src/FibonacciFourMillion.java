import java.io.IOException;
import java.util.Scanner;

public class FibonacciFourMillion {

	public static void main(String args[]) throws NumberFormatException, IOException {

		int a = 0, b = 1;
		int temp = 0, sum = 0;
		System.out.println("Enter the limit value to print the Fibonacci Series whose value is less than 40,00,000 ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		if (val < 4000000) {
			System.out.println("The Fibonacci Series from 1 to " + val + " are:");
			for (int i = 0; i < val; i++) {

				temp = a + b;
				a = b;
				b = temp;

				if (temp < val) {
					System.out.println(temp);

					if (temp % 2 == 0)
						sum += temp;
				} else {
					break;
				}
			}
			System.out.println("Sum of the even valued terms from 1 to " + val + " is: " + sum);
		} else {
			System.out.println("Please enter the range less than 4 million");
		}

	}

}

//William Dunn - Math 240 - Extra Credit

package mathEC;

import java.util.Scanner;

public class sequences {

	public static int n1 = 0;
	public static int n2 = 1;
	public static int sum;
	public static String fraction;

	public static void main(String[] args) {
		System.out.println("Which sequence would you like to do? (type a, b, or c)\n");

		System.out.println("a. the Fibonacci sequence");
		System.out.println("b. the sequence on Quiz 3, #1");
		System.out.println("c. the sequence on Exam 2, #7(a)\n");

		Scanner reader = new Scanner(System.in);

		String choice = reader.next();

		System.out.println("\nYou chose choice " + choice + ", how many terms would you like generated? (type a number)\n");

		int k = reader.nextInt();

		reader.close();

		System.out.println("Got it! Calculating...\n");

		if (choice.equalsIgnoreCase("a")) {
			fibonacciSequence(k);
		} else if (choice.equalsIgnoreCase("b")) {
			quizThree(k);

		} else if (choice.equalsIgnoreCase("c")) {
			examTwo(k);

		} else {
			System.err.println("Invalid entry");
			System.exit(-1);
		}
	}

	public static void fibonacciSequence(int k) {

		for (int i = 0; i < k; i++) {
			System.out.print(n1 + ", ");

			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}
	
	public static void quizThree(int k) {
		
		for (int i = 0; i < k; i++) {
			sum = (int) (n1 * Math.pow(2, n1));		
			n1 = n2;
			n2++;
			
			System.out.print(sum + ", ");
		}
	}
	
	public static void examTwo(int k) {
		
		for (int i = 0; i < k; i++) {
			fraction = (2 * n1) + "/" + (n1 + 1);
			n1 = n2;
			n2++;
			
			System.out.print(fraction + ", ");
		}
	}
}

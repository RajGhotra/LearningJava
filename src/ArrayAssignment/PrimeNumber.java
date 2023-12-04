package ArrayAssignment;

import java.util.Scanner;

public class PrimeNumber {
	//int[] numbers = new int[1];
	Scanner sc = new Scanner(System.in);
	int num;
	int i;
	boolean isPrime = true;

	void findThePrimeNum() {
		System.out.println("Enter the number");

		num = sc.nextInt();

		while (num > 0) {
			for (i = 2; i < num /2; i++) {

				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {

				System.out.println(num  + "is prime number");
				break;
			} else {

				System.out.println(num + "is not the prime number");
				break;
			}

		}

	}}

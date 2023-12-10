package assignmentPizza;

/*Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24”*/

import java.util.Scanner;
import java.io.*;

public class PizzaPizza {

	int priceOfSmallPizza;
	int priceOfMediumPizza;
	int priceOfLargePizza;
	Scanner sc = new Scanner(System.in);
	int ExtraCheese = 1;
	int PepperoniForSmall = 2;
	int PepperoniForMediumOrLarge = 3;
	String selectedPizza;
	int totalBill;
	int sum;

	void totalPizzaBill() {
		System.out.println("Please enter how many Pizza you want");
		int noOfPizza = sc.nextInt();

		while (noOfPizza > 0) {

			System.out.println("Select the  pizza size you want:\n1.small\n 2.Medium\n 3.Large");
			selectedPizza = sc.next();
			System.out.println("Enter the Extra Toppings you want:\n1.PepperoniForSmall\n2.PepperoniForMediumOrLarge");
			int topping = sc.nextInt();

			if (selectedPizza.equalsIgnoreCase("small"))

				sum = priceOfSmallPizza + ExtraCheese + PepperoniForSmall;

			else if (selectedPizza.equalsIgnoreCase("medium"))

				sum = priceOfMediumPizza + ExtraCheese + PepperoniForMediumOrLarge;
			else if (selectedPizza.equalsIgnoreCase("large"))

				sum = priceOfLargePizza + ExtraCheese + PepperoniForMediumOrLarge;

			totalBill = (noOfPizza * sum);

			System.out.println("\n Total Bill is" + totalBill);

		}

		

	}

}

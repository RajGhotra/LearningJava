package amusmentPark;

import java.util.Scanner;

public class MainPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Park park = new Park();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The height");
		park.height = sc.nextInt();
		park.rides();
	}

}

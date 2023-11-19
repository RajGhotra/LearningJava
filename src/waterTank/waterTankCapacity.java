package waterTank;

import java.util.Scanner;

public class waterTankCapacity {
	int capacityOfTank;
	int capacityOfBucket;
	boolean isItOverflowing;
	Scanner sc = new Scanner(System.in);

	void waterTanker() {
		do {
			System.out.println("The Tank have space, put water from bucket" + capacityOfBucket);
			
			System.out.println("Is It Flowing");

			isItOverflowing = sc.nextBoolean();
			if (isItOverflowing) {
				System.out.println("Tank is overflowing ,stop putting more water");
				break;
			}
			capacityOfBucket+=10;
			
		} while (capacityOfTank <100);
		System.out.println("Water Tank is Full");
	}

}

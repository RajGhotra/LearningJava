package amusmentPark;

public class Park {
	int height;
	int noOfPerson;

	void rides() {

		// if (height >= 90 && height <= 200)
		
		for (noOfPerson = 0; noOfPerson < 11; noOfPerson++) {

			System.out.println("Space for peole to ride:" + noOfPerson);
			 //break;
			if (height > 90 && height < 200) {
				System.out.println("Allowed to Take Rides");
			}

			else {
				System.out.println("Not Allowed");
		
			}
		}

	}
}

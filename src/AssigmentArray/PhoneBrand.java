package AssigmentArray;

import java.util.Scanner;

public class PhoneBrand {
	String[] brands= {"Samsung", "Google", "Apple"};
	
String[][] phoneCategory ={{"S20","S21","Flip3","Fold3"},{ "Google Pixel 6","Google Pixel 6 Pro","Google Pixel Pro","Google Pixel 5"},
			{"Iphone12","Iphone SE","Iphone15","Iphone 13"}};
	
	Scanner sc = new Scanner(System.in);
	void displayProducts() {
		System.out.println("Enter the product you want to buy:");
		String product = sc.next();
		boolean itemSelected = false;
		for (int i = 0; i < phoneCategory.length;) {

			for (int j = i+1; j < phoneCategory[i].length; j++) {
				
				if (phoneCategory[i][j].equalsIgnoreCase(product)) {
					itemSelected = true;

				}

			}

			if (itemSelected) {

				System.out.println("Product Selected is:" + product);
				break;

			}

			else {
				System.out.println("Please select the product from the List");
				break;
			}

		}
	}

}

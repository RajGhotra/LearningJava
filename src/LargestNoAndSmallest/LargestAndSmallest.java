package LargestNoAndSmallest;

public class LargestAndSmallest {
	int arr[] = { 1, 100, 20, 30, 50, 500 };
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;

	void toFindLargestAndSmallest() {

		for (int number : arr) {

			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Largest Number in an array is:" + largest);
		System.out.println("Smallest number in an array is :" + smallest);
	}
}

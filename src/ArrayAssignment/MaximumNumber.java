package ArrayAssignment;

public class MaximumNumber {
	int arr[] = { 20, 11, 7, 98, 60, 20 };

	void toFindMaxNum() {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println("The Maximun number in the array is:" + max);
				continue;
			}

		}
	}

}

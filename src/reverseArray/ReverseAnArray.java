package reverseArray;

public class ReverseAnArray {
	int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	int startIndex = 0;
	int endIndex = arr.length - 1;

	void toReverseAnArray() {

	
		while (startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;

			startIndex++;
			endIndex--;

		}
		System.out.println("Reverse Array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

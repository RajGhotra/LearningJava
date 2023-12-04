package SortAnArr;



public class SortTheArr {

	int arr[] = { 25, 32, 38, 87, 21 };
	int temp=0;
	int i;

	void toSortTheArray() {

		System.out.println("The Original Array:");
		for (i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
			for (i = 0; i < arr.length; i++) 
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[j] < arr[i]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

					}

				}
				
				System.out.println("\nThe sorted Array is:");
				for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
				
			}
		}
	}



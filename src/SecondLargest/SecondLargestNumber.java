package SecondLargest;

public class SecondLargestNumber {
	int[]arr= {1,28,38,93,46,97};
	int num;
	int size;
	
	
	void toFindTheSecondLargestNum() {
		size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j] ){
					
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
		}
		System.out.println("The second Largest Number in the array is:"+arr[size-2]);
	}

	

}

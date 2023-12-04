package duplicateNum;

public class DuplicateNumbers {
	 int[] arr= {1,5,5,7,8,8,9,72,52,9,10};
	 
	 void toFindDuplicateNumber() {
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]==arr[j]&&(i!=j)) {
					 
					 System.out.println("Duplicate Numbers:"+arr[j]);
					 
				 }
				 
				 
			 }
		 }
	 }

}

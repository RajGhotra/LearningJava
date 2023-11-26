package ArrayInteger;

public class Numbers {
	
	int[] numbers = {-40,-5,1,3,6,7,8,20};
	int sum=15;
	
	
	void sumOfIntegers() {
		
		for(int i=0;i<numbers.length;i++) {
			
		for(int j=i+1;j<numbers.length;j++) {
			if(numbers[i]+numbers[j]==sum)
			
			System.out.println("Sum of " +numbers[i]+" and "+ numbers[j]+"is:"+ sum);
			continue;
				
			
		}
			
			
		}
	}

}

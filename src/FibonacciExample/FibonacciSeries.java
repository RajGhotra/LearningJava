package FibonacciExample;

public class FibonacciSeries {
	
	int num1=0;
	int num2=1;
	int totalTerm=10;
	
	void toPrintFibonacci() {
		
		
		for(int i=1;i<totalTerm;i++) {
			System.out.print(num1+",");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
		
	}

}

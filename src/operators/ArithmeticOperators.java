package operators;

public class ArithmeticOperators {
int num1;
int num2;

void add(){
	int sum=num1+num2;
	System.out.println("The Sum of num1 and num2 is"+sum);
}
void subtract() {
	int difference=num1-num2;
	System.out.println("Difference is"+difference);
	
}
void multiply() {
	int product=num1*num2;
	System.out.println("Product is "+product);
	
}
void division() {
	int quotient=num1/num2;
	double remainder=num1%num2;
	System.out.println("quotient is"+quotient);
	System.out.println("The Remainder is"+remainder);
}

}

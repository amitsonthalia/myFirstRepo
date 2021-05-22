package helloworld_amit;

import org.testng.annotations.Test;

public class FibonacciTest {
	
	@Test
	public void printFibonacciSeries() {
		
		int count = 10;
		int firstNumber = 0;
		int secondNumber = 0;
		int sum=1;
		
		while (count>0) {
			
			firstNumber = secondNumber;
			secondNumber = sum;
			sum=firstNumber+secondNumber;
			System.out.println(firstNumber);
			
			count--;
		}
	}
}

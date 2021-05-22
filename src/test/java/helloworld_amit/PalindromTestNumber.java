package helloworld_amit;

import org.testng.annotations.Test;

public class PalindromTestNumber {
	
	@Test
	public void palindromCheck(){
		
		int inputNumber = 123454321;
		int number = inputNumber;
		int palindromNumber = 0;
		
		while(number>0) {
			palindromNumber = palindromNumber+number%10;
			if (number >10) {
			palindromNumber = palindromNumber*10;
			}
			number = number/10;
		}
		
		if (inputNumber == palindromNumber) {
			System.out.println("Given Number: "+inputNumber+" is Palindrom");
		}
		else {
			System.out.println("Given Number : "+inputNumber+" is Not Palindrom");
		}
		}
}

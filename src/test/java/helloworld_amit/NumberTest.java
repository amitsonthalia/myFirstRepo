package helloworld_amit;

import org.testng.annotations.Test;

public class NumberTest {
	
	@Test
	public void isPrime() {
		
		int number = 11;
		boolean status = false;
		
		for (int i = 2; i<number/2 ; i++) {
			if (number%i == 0) {
				status = true;
				break;
			}
			//status = false;
		}
		
		if (status)
			System.out.println("Given Number "+number+" is not prime");
		else
			System.out.println("Given Number "+number+" is prime");
	}
	
	public static void getReverseNumber() {
		
		int number = 15231;
		int revNum=0;
		int temp=0;
		while (number>0) {
			temp = number % 10;
			number=number/10;
			revNum = revNum*10+temp;
			
		}
		System.out.println("Reversed Number is "+revNum);
	}
	
	public static void isArmstrong() {
		
		int number = 370;
		int copyOfNumber = number;
		 
        int noOfDigits = String.valueOf(number).length();
 
        int sum = 0;
        
        while (number>0) {
        	int temp = number%10;
        	int tempProduct=1;
        	
        	for (int i=0;i<noOfDigits;i++) {
        		tempProduct = temp*tempProduct;
        	}
        	sum= sum+tempProduct;
        	number = number/10;
        }
        
        if (copyOfNumber == sum)
        	System.out.println("Number "+copyOfNumber+" is Armstrong");
        else
        	System.out.println("Number "+copyOfNumber+" is not Armstrong");
		
		
	}
}

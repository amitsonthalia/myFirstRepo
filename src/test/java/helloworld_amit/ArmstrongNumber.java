package helloworld_amit;

import org.testng.annotations.Test;

public class ArmstrongNumber {
  @Test
  public void armstrongNumber() {
	  
	  System.out.println("List of Armstrong number from 1-500");
	  
	  for (int i=1; i<=500; i++) {
		  if (findArmstrong(i)) {
			  System.out.println("Number "+ i +" is Armstrong");
		  }
	  }
  }
  
  public Boolean findArmstrong(int num) {
	  Boolean status = false;
	  int number = num;
	  int finalNumber = 0;
	  
	  while (number > 0) {
		  int temp = number%10;
		  finalNumber = finalNumber + (temp*temp*temp);
		  number = number/10;
	  }
	  
	  if (num ==finalNumber) {
		  //System.out.println(num +" and "+finalNumber +" are Armstrong" );
	      status = true;}	
	  else {
		  //System.out.println(num +" and "+finalNumber +" are not Armstrong" );
	  }
	  
	  return status;
	  
  }
}

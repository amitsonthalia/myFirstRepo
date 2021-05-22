package helloworld_amit;

import org.testng.annotations.Test;

public class PalindromTest  {
	
	@Test
	public void palindromCheck () {
		
		String inputText="abcdefedcba";
		String plaindromText="";
		for (int i = inputText.length()-1; i>=0; i--) {
			plaindromText = plaindromText+inputText.charAt(i);
		}
		
		if (inputText.equalsIgnoreCase(plaindromText)) {
			System.out.println("Given String: "+inputText+" is Palindrom");
		}
		else {
			System.out.println("Given String: "+inputText+" is Not Palindrom");
		}
	}
	
}

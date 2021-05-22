package helloworld_amit;

import org.testng.annotations.Test;

public class ExtractNumFromString {
	
	@Test
	public void numberFromString() {
		
		String inputText = "cgcHHG!@#$%$543563476";
		
		//Extract only Number
		System.out.println(inputText.replaceAll("[^0-9]", ""));
		
		//Extract only Special Characters
		System.out.println(inputText.replaceAll("[0-9a-zA-Z]", ""));
		
		//Extract Characters except number and special characters
		System.out.println(inputText.replaceAll("[^a-zA-Z]", ""));
	}
}

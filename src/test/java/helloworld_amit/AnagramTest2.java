package helloworld_amit;

import java.util.Arrays;
import org.testng.annotations.Test;

public class AnagramTest2 {
  @Test
  public void anagramTestInBuild() {
	  System.out.println("Anagram Test with inbuild method");
	  
	  String s1="Mother In Law";
	  String s2="Hitler Woman";
	  
	  char ch1[]=s1.toLowerCase().replaceAll(" ", "").toCharArray();
	  char ch2[]=s2.toLowerCase().replaceAll(" ", "").toCharArray();
	  
	  if (ch1.length != ch2 .length) {
		  System.out.println("String "+s1+" and "+s2+" are not Anagram");
	  }
	  else {
		  Arrays.sort(ch1);
		  Arrays.sort(ch2);
		  
		  if (Arrays.equals(ch1, ch2))
			  System.out.println("String "+s1+" and "+s2+" are Anagram");
		  else
			  System.out.println("String "+s1+" and "+s2+" are not Anagram");
	  }
	  
	  
  }
}

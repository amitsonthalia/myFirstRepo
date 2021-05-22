package helloworld_amit;

import org.testng.annotations.Test;

public class AnagramTest {
  @Test
  public void anagramTest() {
	  
	  System.out.println("Anagram Test in detail");
	  
	  String s1="Mother In Law";
	  String s2="Hitler Woman";
	  
	  s1=s1.toLowerCase().replaceAll(" ", "");
	  s2=s2.toLowerCase().replaceAll(" ", "");
	  
	  if (s1.length() != s2.length()) {
		  System.out.println("String "+s1+" and "+s2+" are not Anagram");		  
	  }
	  else {
		  char[] c1 =sort(s1);
		  char[] c2 =sort(s2);
		  
		Boolean flag=false;  
		  
		for (int i=0;i<s1.length();i++) {
			
			if (c1[i] != c2[i]) {
				System.out.println("String "+s1+" and "+s2+" are  not Anagram");
				break;
			}
			  else
				  flag=true;			
		} 
		
		if (flag)
			System.out.println("String "+s1+" and "+s2+" are  Anagram");
	  }	  
  }
  
  public char[] sort(String inputString) {
	  char[] ch= inputString.toCharArray();
	  
	  for (int i=0; i<= ch.length-1; i++) {
		  for (int j=i+1; j<=ch.length-1; j++) {
		  if (ch[j] < ch[i]) {
			  char temp = ch[i];
			  ch[i]= ch[j];
			  ch[j] = temp;
		  }
		  }
	  }
	  System.out.println(ch);
	  return ch;
  }
}

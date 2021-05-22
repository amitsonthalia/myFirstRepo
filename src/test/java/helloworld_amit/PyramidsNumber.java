package helloworld_amit;

import org.testng.annotations.Test;

public class PyramidsNumber {
	
	@Test
	public void printPyramid() {
		
		for (int i=1; i<10; i++) {
			for (int j=10;j>=i;j--) {
				System.out.print(" ");
			}
			
			for (int j=i;j<=i;j++) {
				int count =i;
				while(count>0) {
				System.out.print(j+" ");
				count--;
				}
			}
			System.out.println();
		}
	}
}

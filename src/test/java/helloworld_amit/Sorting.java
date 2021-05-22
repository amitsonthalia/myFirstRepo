package helloworld_amit;

import org.testng.annotations.Test;

public class Sorting {
	
	@Test
	public void selectionSort() {
		
		System.out.println("Inside Selection Sort");
		int[] input = new int[] {45, 84, 101, 62, 12, 45};
		int arrayLength= input.length;
		int temp;
		for (int i=0; i<arrayLength; i++) {
			for (int j=(i+1); j<arrayLength; j++) {
				if (input[i]>input[j]) {
					temp=input[j];
					input[j]=input[i];
					input[i]=temp;
				}
			}
			
		}
		
		
		  for (int i=0; i<arrayLength; i++) { System.out.println(input[i]); }
		 
	}
	
	@Test
	public void insertionSort() {  
		
		System.out.println("Inside Insertion Sort");
		int[] array = new int[] {45, 84, 101, 62, 12, 45};
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
        for (int i=0; i<n; i++) { System.out.println(array[i]); }
    } 
}


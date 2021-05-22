package helloworld_amit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Mapfunctions {
	
	@Test
	public void countCharactersOccurence(){
		
			String input = "mymap";
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			char ch[]= input.toLowerCase().toCharArray();
			
			for (char c : ch) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else {
					map.put(c, 1);
				}
			}
			
			//Retrieve Values from Map
			
			for (Map.Entry<Character, Integer> me2: map.entrySet()) {
				System.out.println("Key is "+me2.getKey()+" Value is "+me2.getValue());
			}
	}
	
	@Test
	public void firstDuplicateCharacter() {
		String input = "mymapp";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[]= input.toLowerCase().toCharArray();
		boolean status = false;
		
		for (char c : ch) {
			if (map.containsKey(c)) {
				System.out.println("First Duplicate Character is "+c);
				status = true;
				break;
			}
			else {
				map.put(c, 1);
			}
		}
		
		if (status)
			System.out.println("Duplicate character found");
		else
			System.out.println("No Duplicate Character");
	}
	
	
	@Test
	public void listOfDuplicateCharacter() {
		
		String input="abbcccdddd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[]= input.toLowerCase().toCharArray();
		
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println("List of Duplicate Characters are");
		Set<Character> mapCharacters =   map.keySet();
		for (char c :mapCharacters ) {
			if (map.get(c)>1) {
				System.out.println("Duplicate Characters is "+c+" and Its count is "+map.get(c));
			}
		}
	}
}

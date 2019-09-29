package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : array) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < array.size(); i+=2) {
			System.out.println(array.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = array.size() - 1; i > -1; i--) {
			System.out.println(array.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).contains("e")) {
				System.out.println(array.get(i));
			}
		}
	}
}

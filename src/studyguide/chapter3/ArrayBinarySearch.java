package studyguide.chapter3;

import java.util.*;

public class ArrayBinarySearch {
	
	public void searchingInArray() {
		
		int[] numbers = {2, 4, 6, 8}; //sorted
		int[] numbers2 = {4, 2, 8, 6}; //not sorted
		
		System.out.print(Arrays.binarySearch(numbers, 2) + " "); //prints 0 -> index of number "2" in the array
		System.out.print(Arrays.binarySearch(numbers, 6) + " ");
		
		//Què passa si col·loquem un número que no existeix a l'array?
		System.out.print(Arrays.binarySearch(numbers, 9) + " "); //prints -5
		
		
		//Not sorted
		System.out.print(Arrays.binarySearch(numbers2, 6) + " "); //prints -3
		
	}

}

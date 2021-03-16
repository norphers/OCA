package studyguide.chapter3;

import java.util.Arrays;

//import java.util.Arrays;

public class ArraySort {
	
	public void sortingIntArray() {
		
		int[] numbers = {6, 9, 1};
		
		java.util.Arrays.sort(numbers);
		
//		System.out.print(numbers); //prints [I@762efe5d
		
		for(int i=0; i<numbers.length; i++) System.out.print(numbers[i] + ", ");
	
	}
	
	public void sortingStringArray() {
		
		String[] strings = {"10", "9", "100"};
		
		Arrays.sort(strings);
		
		for(String str : strings) System.out.print(str + " "); //prints 10, 100, 9, 
	
	}

}

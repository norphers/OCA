package main; 

import studyguide.chapter3.*;
import studyguide.chapter4.protectedAcces.shore.*;

public class Main {

	public static void main(String[] args) {
		
//		chapter1();
//		chapter2();
//		chapter3();
		chapter4();
		
	}

	public static void chapter1() {
		
	}
	
	public static void chapter2() {
		
	}
	
	public static void chapter3() {
		
//		//For loop in Arrays
		ArrayForLoop arrayForLoop = new ArrayForLoop();
		arrayForLoop.forLoop();
		
//		//Sorting 
		ArraySort sortingArrays = new ArraySort();
		sortingArrays.sortingIntArray();
		sortingArrays.sortingStringArray();
		
		//Searching
		ArrayBinarySearch arrayBinarySearch = new ArrayBinarySearch();
		arrayBinarySearch.searchingInArray();
	}
	
	public static void chapter4()
	{
		Sparrow sparrow = new Sparrow();
		sparrow.activity();
		
	}
	
	
}

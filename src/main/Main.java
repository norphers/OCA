package main; 

import studyguide.chapter3.*;
import studyguide.chapter4.InstanceVariables;
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
//		Sparrow sparrow = new Sparrow();
//		sparrow.activity();
		
		//static methods and variable doen't need to be instantiated 
		//InstanceVariables iv = new InstanceVariables();
//		InstanceVariables.staticMethod();
		
		
//		System.out.println(iv.count); //java uses the 'InstanceVariables' in front of 'iv'
//		iv = null; //iv points now to null object
//		iv.count = 2;
//		System.out.println(iv.count); //java still printing the 'InstanceVariables'
//		InstanceVariables.count = 4;
//		System.out.println(iv.count);
//		//només existeix una varible count ja que és static
//		//encara que canviem la referencia de l'objecte, 
//		//segueix sent la mateixa variable.
		
		//static variable, use it without instantiated
		System.out.println(InstanceVariables.classVariable_static);
		
		//A STATIC MEMBER (MAIN in this case), CANNOT CALL AN INSTANCE MEMBER (non-static field or method)
		//instance variable --> Need to instantiate
//		System.out.println(InstanceVariables.instanceVariable); //DOES NOT COMPILE
		
		//instance variable instantiated
		InstanceVariables iv = new InstanceVariables();
		System.out.println(iv.instanceVariable);
		
		
		
	}
	
	
}

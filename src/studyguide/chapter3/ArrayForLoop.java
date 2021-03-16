package studyguide.chapter3;

public class ArrayForLoop {

	public void forLoop() {
		
		int numbers[] = new int[10];
		
//		numbers[10] = 3; //index numbers[10] is out of bounds
		
//		numbers[numbers.length] = 5; //index numbers[10] is out of bounds

//		for(int i=0; i<=numbers.length; i++) System.out.print(numbers[i] = i + 5); // java.lang.ArrayIndexOutOfBoundsException
		
		for(int i=0; i<numbers.length; i++) System.out.print((numbers[i] = i + 5) + ", "); 
		
	}
	
}

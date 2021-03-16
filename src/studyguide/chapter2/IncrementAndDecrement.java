package studyguide.chapter2;

public class IncrementAndDecrement
{

  public static void main(String[] args)
  {
	int a = 4;
	int b = 4;
	System.out.println(a++); // return 4, then increment by 1 
	System.out.println(++b); // increment by 1, return 5

//	int c = 4++; //DOES NOT COMPILE - unexpected type
//	int d = --4; //DOES NOT COMPILE - unexpected type

  }

}
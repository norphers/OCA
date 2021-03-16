package studyguide.chapter2;

public class NumericPromotion
{

  public static void main(String[] args)
  {

    short a = 14;
    float b = 13;
    double c = 30;
 
	// sort automatically promoted to int (rule3)
	// int promoted to float (rule2)
	// float result promoted to double (rule1)
	// result double

    System.out.println(a*b/c);

  }

}
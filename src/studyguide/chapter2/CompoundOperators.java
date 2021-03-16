package studyguide.chapter2;

public class CompoundOperators
{
    public static void main(String[] args)
    {
		
	int x = 4;
	long y = 35;

//	x = x + y; //DOES NOT COMPILE
//	incompatible types: possible lossy conversion from long to int

//	x += y;	

//	x += y <=> x = (int)(x + y);



	long r = 5;
	long s = (r=3);

	System.out.println(r); // print 3	
	System.out.println(s); // print 3	


//	PrintVarType();
	
    }

    public static void PrintVarType(Object obj)
    {
	System.out.println(obj.getClass().getName());
    }


}
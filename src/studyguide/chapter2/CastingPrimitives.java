package studyguide.chapter2;

public class CastingPrimitives
{
    public static void main(String[] args)
    {
		
	int r = (int)1.0; 
	
	short s = (short)1_921_254; //stored as 20710
	/*
	  1.921.254 is too large to be stored as a short value, 
	  so numeric overflow occurs and it becomes 20.710 
	*/

	int t = (int)9f; 

	int t2 = (int)9.0f; 

	long u = 192_301_391_584_325_184L;

	System.out.println(r);
	System.out.println(s);
	System.out.println(t);
	System.out.println(t2);
	System.out.println(u);

//	PrintVarType();
	
    }

    public static void PrintVarType(Object obj)
    {
	System.out.println(obj.getClass().getName());
    }


}
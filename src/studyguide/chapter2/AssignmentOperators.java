package studyguide.chapter2;

public class AssignmentOperators
{
    public static void main(String[] args)
    {
	int x = 1; //= assign x to value 1
		
//	int r = 1.0; //DOES NOT COMPILE
//	incompatible types: possible lossy conversion from double to int

//	short s = 45445; //DOES NOT COMPILE 
//	error: incompatible types: possible lossy conversion from int to short

//	int t = 9f; //DOES NOT COMPILE
//	error: incompatible types: possible lossy conversion from int to short

//	int t2 = 9.0f;  //DOES NOT COMPILE
	
//	long u = 192301391584325184; //DOES NOT COMPILE
//	error: integer number too large: 192301391584325184

//	PrintVarType(t2);
	
    }

    public static void PrintVarType(Object obj)
    {
	System.out.println(obj.getClass().getName());
    }


}
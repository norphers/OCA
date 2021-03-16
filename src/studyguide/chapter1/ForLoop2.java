package studyguide.chapter1;

public class ForLoop2
{
    public static void main(String[] args)
    {

/*	java.util.List<String> names = new java.util.ArrayList<String>();
	names.add("a");
	names.add("b");
	names.add("c");

	for(int i=0; i<names.size(); i++)
	{
	    String name = names.get(i);
	    if(i>0) System.out.print(", ");
	    System.out.print(name);
	}
*/

	int[] values = new int[3];
	values[0] = 10;
	values[1] = new Integer(5);
	values[2] = 15;

	for(int i=1; i<values.length; i++)
	{
	    System.out.print((values[i]-values[i-1]) + ",");
		// values[1]-values[1-1] => values[1]-values[0] => 5-10 = -5
		// values[2]-values[2-1] => values[2]-values[1] => 15-5 = 10
	}


    }


}
package studyguide.chapter4;

public class InstanceVariables
{
	public static String classVariable_static = "static variable";
	
	public static int count = 0;
	
	public String instanceVariable = "instance variable";
	
	public static void staticMethod() 
	{
		System.out.println(classVariable_static);
	}
	
	public void nonStaticMethod() { System.out.println(instanceVariable); }

}

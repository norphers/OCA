package studyguide.chapter4;

public class Gorilla
{
	public static int count;
	
	public static void addGorilla() { count++; }
	
	public void addBabyGorilla() { count++; }

	public void announceBabies() {
		addGorilla();
		addBabyGorilla();
	}
	
	
	
	public static void announceToEveryone() {
		addGorilla();
//		addBabyGorilla(); //DOES NOT COMPILE
		Gorilla g = new Gorilla();
		g.addBabyGorilla();
	}
	
	public int total;
//	public static double average = total/count; //DOES NOT COMPILE

}

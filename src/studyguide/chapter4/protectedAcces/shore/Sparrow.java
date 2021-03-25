package studyguide.chapter4.protectedAcces.shore;

public class Sparrow extends Bird
{
	public void activity() {
		fly();
		System.out.println(birdField); //inherited field of bird class 
	}
}


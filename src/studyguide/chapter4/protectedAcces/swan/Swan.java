package studyguide.chapter4.protectedAcces.swan;

import studyguide.chapter4.protectedAcces.shore.Bird;

public class Swan extends Bird
{
	public void activity() {
		Bird swan = new Bird();
		swan.fly();
		fly();
	}
	
}

class Swan2 extends Bird 
{
	public void activity() {
		fly();
	}
	
}

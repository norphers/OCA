package studyguide.chapter4.protectedAcces.swan;

import studyguide.chapter4.protectedAcces.shore.Bird;

public class Swan extends Bird
{
	public void notIneritedBird() {
		
		Bird swan = new Bird(); 
		//Est�s instanciando un nuevo objeto Bird con
		//referencia 'swan'.  
//		swan.fly(); //DOES NOT COMPILE
		//no compila porqu� el objecto Bird  al cual est�s
		//haciendo referencia pertenece a otro package.
		//swan.fly() no hereda de Bird y no puede usar sus
		//m�todos.
	}
	
	public void inheretedBird() {
		fly();
		System.out.println(birdField);
	}
	
}

class Swan2 extends Bird 
{
	public void activity() {
		fly();
	}
	
}

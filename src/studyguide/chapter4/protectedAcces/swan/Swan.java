package studyguide.chapter4.protectedAcces.swan;

import studyguide.chapter4.protectedAcces.shore.Bird;

public class Swan extends Bird
{
	public void notIneritedBird() {
		
		Bird swan = new Bird(); 
		//Estás instanciando un nuevo objeto Bird con
		//referencia 'swan'.  
//		swan.fly(); //DOES NOT COMPILE
		//no compila porquè el objecto Bird  al cual estás
		//haciendo referencia pertenece a otro package.
		//swan.fly() no hereda de Bird y no puede usar sus
		//métodos.
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


public class Eroe extends Persona{
	String potere;
	//classe costruttore
	Eroe(String nome, int eta, String potere){
		//utilizziamo super per passare il nome e l'eta al costruttore di Persona
		super(nome, eta);
		this.potere = potere;
	}
	
	//override del metodo toString e uso di super per richiamare il toString di Persona
	public String toString() {
		return super.toString() + " " + this.potere;
	}
}

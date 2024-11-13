
public class Eroe extends Persona{
	String potere;
	//classe costruttore
	Eroe(String nome, int eta, String potere){
		//utilizziamo super per passare il nome e l'eta al costruttore di Persona
		super(nome, eta);
		this.potere = potere;
	}
}

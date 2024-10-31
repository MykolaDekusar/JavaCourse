
public class Macchina {

	//inizializziamo le variabili necessarie per il costruttore
	String marca;
	String modello;
	int vMax;
	float consumi;
	
	//scriviamo il costruttore con gli argomenti che prende
	Macchina(String marca, String modello, int vMax, float consumi){
		//this serve ad indicare l'istanza corrente dell'oggetto es:
		//nel caso di macchina1 this sarà associato a macchina1
		//nel caso di macchina2 this sarà associato a macchina2 etc..
		this.marca=marca;
		this.modello=modello;
		this.vMax=vMax;
		this.consumi=consumi;
	}
}

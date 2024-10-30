
public class Main {

	public static void main(String[] args) {
		//object = un istanza di una classe che può contenere attributi e metodi
		//gli attributi sono gli aspetti di un oggetto
		//i metodi sono le cose che può fare un oggetto
		//esempi: telefono, tavolo, computer, mouse
		//esempti attributo telefono: colore, peso, dimensioni
		//esempi metodi telefono: chiama(), gioca(), riproduci()
		
		//CREIAMO UN OGGETTO MACCHINA AL DI FUORI DELL'OGGETO Main
		
		//Ora creiamone un istanza
		Macchina macchina = new Macchina();
		//Per accedere agli attributi e ai metodi del nuovo oggetto usiamo il punto .
		System.out.println(macchina.colore);
		System.out.println(macchina.consumi);
		System.out.println(macchina.marca);
		System.out.println(macchina.modello);
		//Richiamiamo i metodi
		macchina.accellera();
		macchina.frena();
		
		//Possiamo creare piu oggetti Macchina ma avranno tutte le stesse caratteristiche
		//Nella prossima lezione vediamo i COSTRUTTORI che ci permettono di creare oggetti
		//con caratteristiche diverse
	}

}

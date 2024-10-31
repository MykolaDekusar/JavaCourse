
public class Main {

	public static void main(String[] args) {
		//toString() = metodo speciale che tutti gli oggetti ereditano e che restituscie
		//             una stringa che "testualmente rappresenta" un oggetto
		//             puo essere inplicita o esplicita
		Macchina car = new Macchina();
		//il print e println contengono implicitamente il toString()
		System.out.println(car);
		//oppure possiamo richiamarlo in modo esplicito
		System.out.println(car.toString());
		//l'abbiamo sovrascritto nell'oggetto Macchina per restituirci una stringa con i dati dell'oggetto
	}

}

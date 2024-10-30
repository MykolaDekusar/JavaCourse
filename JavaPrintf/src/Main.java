
public class Main {

	public static void main(String[] args) {
		//printf() = un metodo opzionale per formattare, stampare e formattare i dati in console
		//           richiede 2 argomenti= una stringa + (oggetto/variabile/valore)
		//           % seguito da [flags] [precisione] [larghezza] [carattere di conversione]
		
		//creiamo delle variabili
		boolean bool = true; //carattere di conversione: %b
		char myChar = 'A'; //carattere di conversione: %c
		int myInt = 123; //carattere di conversione: %d
		double myDouble= 3.14; //carattere di conversione: %f sia per i double che i float
		String myString="Test printf"; //carattere di conversione: %s
		
		System.out.printf("%s sulla mia stringa",myString); //Test printf sulla mia stringa
		
		//[larghezza]
		//imposta il numero minimo di caratteri da mostrare
		//i caratteri vuoti verranno riempiti da spazi
		System.out.printf("Ho %5d mele",myInt); //myInt ha 3 numeri quindi settando 5 larghezza
		//avro 2 spazi davanti al numero Ho   123 mele
		
		//[precisione]
		//imposta la precisione dei numeri decimali dopo la virgola
		System.out.printf("Così avro 5 decimali dopo la virgola: %.5f", myDouble);
		//Così avro 5 decimali dopo la virgola: 3,14000
		
		//[flags]
		//aggiunge un effetto all'output in base al flag aggiunto

		// - : giustifica-sinistra

		// + : mette un segno piu ( + ) o un segno meno ( - ) ad un valore numerico

		// 0 : gli spazi vuoti vengono riempiti da 0

		// , : separa numeri > 1000 con una virgola

		
	}

}

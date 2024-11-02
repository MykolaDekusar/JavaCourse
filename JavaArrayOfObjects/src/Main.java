import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Chiediamo all'utente quanti cibi vuole inserire
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci quanti cibi vuoi aggiungere al frigo: ");
		int quantita = scanner.nextInt();
		scanner.nextLine();
		
		//imposto la lunghezza dell'array di oggetti cibo all'input dell'utente
		Cibo[] frigo = new Cibo[quantita];
		//Chiedo all'utente di inserire nomne del cibo e creo una classe e la inserisco
		//nell'array frigo
		for(int i=1;i<=quantita;i++) {
			System.out.println("Inserisci il nome del cibo n°"+i);
			String ciboInserito = scanner.nextLine();
			Cibo cibo  = new Cibo(ciboInserito);
			frigo[i-1] = cibo;
		}
		scanner.close();
		//Ora stampiamo i nomi dei cibi inseriti dall'utente
		for(Cibo i : frigo) {
			System.out.println(i.nome);
		}
		
	}

}

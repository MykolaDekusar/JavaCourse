import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Un arrayList 2d è un insieme di arrayList
		//molto simile ad un array 2d
		//dobbiamo importare java.util.*
		ArrayList<Integer> voti = new ArrayList<Integer>();
		voti.add(5);
		voti.add(3);
		voti.add(8);
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(12);
		data.add(21);
		data.add(2);
		//inizializziamo l'arrayList 2d
		ArrayList<ArrayList<Integer>> nomiData = new ArrayList<ArrayList<Integer>>();
		//Aggiungiamo all'arrayList 2d i nostri ArrayList singoli
		nomiData.add(voti);
		nomiData.add(data);
		System.out.println(nomiData);
		//per accedere ad un singolo elemento dell' ArrayList prima dobbiamo 
		//prenderne l'indice e poi l'indice dell'elemento su quel ArrayList
		System.out.println(nomiData.get(1).get(1));
		//prendo il secondo ArrayList e il secondo elemento (21)
	}

}
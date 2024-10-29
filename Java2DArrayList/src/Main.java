import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Un arrayList 2d è un insieme di arrayList
		//molto simile ad un array 2d
		//dobbiamo importare java.util.*
		ArrayList<Integer> voti = new ArrayList();
		voti.add(5);
		voti.add(3);
		voti.add(8);
		ArrayList<Integer> data = new ArrayList();
		data.add(12);
		data.add(21);
		data.add(2);
		//inizializziamo l'arrayList 2d
		ArrayList<ArrayList<Integer>> nomiData = new ArrayList();
		//Aggiungiamo all'arrayList 2d i nostri ArrayList singoli
		nomiData.add(voti);
		nomiData.add(data);
		System.out.println(nomiData);
	}

}
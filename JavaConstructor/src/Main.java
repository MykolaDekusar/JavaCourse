
public class Main {

	public static void main(String[] args) {
		//creiamo un nuovo oggetto macchina1 e macchina2 associandole valori diversi
		Macchina macchina1 = new Macchina("Hyundai", "i20N", 240, 6.7f);
		//creiamo una nuova macchina
		Macchina macchina2 = new Macchina("Mercedes", "CLS", 280, 8.0f);
		
		//stampiamo i valori di entrambi gli oggetti
		System.out.println(macchina1.marca+" "+ macchina1.modello+" "+macchina1.vMax+" "+macchina1.consumi);
		System.out.println(macchina2.marca+" "+ macchina2.modello+" "+macchina2.vMax+" "+macchina2.consumi);
	}

}
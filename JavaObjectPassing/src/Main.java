
public class Main {

	public static void main(String[] args) {
		//creiamo delle macchine
		Macchina auto1 = new Macchina("BMW");
		Macchina auto2 = new Macchina("Mercedes");
		Macchina auto3 = new Macchina("Audi");
		//creiamo l'oggetto garage
		Garage garage = new Garage();
		//applichiamo il metodo parcheggia passondo gli oggetti auto
		garage.parcheggia(auto1);
		garage.parcheggia(auto2);
		garage.parcheggia(auto3);
	}

}

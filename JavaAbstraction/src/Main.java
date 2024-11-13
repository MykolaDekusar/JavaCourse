
public class Main {

	public static void main(String[] args) {
		
		//siccome Veicolo è abstract non possiamo inizializzarlo
		Auto auto1 = new Auto();
		//richiamiamo il metodo vai che abbiamo overridato
		auto1.vai();
	}

}

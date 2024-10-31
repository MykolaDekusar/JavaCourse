import java.util.Random;

public class LanciaDado {

	//creiamo un metodo per far uscire un numero da 1 a 6
	void roll() {
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);
	}
}

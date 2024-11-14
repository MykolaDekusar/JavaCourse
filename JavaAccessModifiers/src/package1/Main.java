package package1;
import package2.*;//importiamo tutte le classi dal package 2

public class Main {

	public static void main(String[] args) {
		//creiamo un istanza della classe C
		C c = new C();
		System.out.println(c.messaggioPublic);
	}

}

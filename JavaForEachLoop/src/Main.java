import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//for-each loop è meno flessibile però è piu comodo
		//funziona sia per gli array che le collection (ArrayList)
		String[] animali = {"cane","gatto"};
		//per ogni stringa indice in animali stampami l'animale
		for(String i : animali) System.out.println(i);
		//creo un array
		int[] nums = {1,3,4,1,6};
		for(int i : nums) System.out.println(i);
		//creo una collection
		ArrayList<Integer> numeri = new ArrayList();
		numeri.add(12);
		numeri.add(98);
		numeri.add(863);
		//per ogni integer in indice i dentro numeri stampami il nunmero
		for(Integer i : numeri) System.out.println(i);
	}

}

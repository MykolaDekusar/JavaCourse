
public class Main {

	public static void main(String[] args) {
		//static = un modificatore. Assegnando static a una variabile/metodo rende quella
		//         variabile/metodo globale alla classe
		
		Amico amico1 = new Amico("Marco");
		Amico amico2 = new Amico("Luca");
		Amico amico3 = new Amico("Sara");
		
		System.out.println(amico1.nome);
		System.out.println(amico2.nome);
		System.out.println(amico3.nome);
		//il static ci permette direttamente di accedere al dato dalla classe
		System.out.println(Amico.nAmici);
		//richiamiamo il metodo static dalla classe Amico
		Amico.quantiAmici();
	}

}

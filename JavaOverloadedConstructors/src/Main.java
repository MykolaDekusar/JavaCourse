
public class Main {

	public static void main(String[] args) {
		// Sono simili ai overloaded methods
		//Overloaded Constructors = più costruttori dentro una classe che hanno lo stesso nome
		//                          ma il numero di parametri diverso
		//                          nome + parametri = firma
		
		//ABBIAMO CREATO 4 COSTRUTTORI CON LO STESSO NOME MA PARAMETRI DIVERSI
		//creiamo una pizza che manda 4 argomenti
		Pizza pizzaCon4Argomenti = new Pizza("Integrale","Pomodoro","Mozzarella","Salame");
		System.out.println(pizzaCon4Argomenti.impasto);
		System.out.println(pizzaCon4Argomenti.salsa);
		System.out.println(pizzaCon4Argomenti.formaggio);
		System.out.println(pizzaCon4Argomenti.topping);
		
		System.out.println();
		//creiamo una pizza che manda 3 argomenti
		Pizza pizzaCon3Argomenti = new Pizza("Normale","Spinaci","Gorgonzola");
		System.out.println(pizzaCon3Argomenti.impasto);
		System.out.println(pizzaCon3Argomenti.salsa);
		System.out.println(pizzaCon3Argomenti.formaggio);
			
		System.out.println();
		//creiamo una pizza che manda 2 argomenti
		Pizza pizzaCon2Argomenti = new Pizza("Carbone","Latte");
		System.out.println(pizzaCon2Argomenti.impasto);
		System.out.println(pizzaCon2Argomenti.salsa);
		
		System.out.println();
		//creiamo una pizza che manda 1 argomento
		Pizza pizzaCon1Argomenti = new Pizza("Insetti");
		System.out.println(pizzaCon1Argomenti.impasto);
		
		System.out.println();
		//creiamo una pizza senza argomenti
		Pizza pizzaSenzaArgomenti = new Pizza();
		System.out.println(pizzaSenzaArgomenti.impasto);
		System.out.println(pizzaSenzaArgomenti.salsa);
		System.out.println(pizzaSenzaArgomenti.formaggio);
		System.out.println(pizzaSenzaArgomenti.topping);
	}

}

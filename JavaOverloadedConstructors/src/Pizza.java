
public class Pizza {

	//inizializziamo delle variabili per creare la nostra pizza
	String impasto;
	String salsa;
	String formaggio;
	String topping;
	//creiamo dei costruttori
	
	//COSTRUTTORE CHE HA 4 PARAMETRI
	Pizza(String impasto, String salsa, String formaggio, String topping){
		this.impasto=impasto;
		this.salsa=salsa;
		this.formaggio=formaggio;
		this.topping=topping;
	}
	
	//COSTRUTTORE CHE HA 3 PARAMETRI
	Pizza(String impasto, String salsa, String formaggio){
		this.impasto=impasto;
		this.salsa=salsa;
		this.formaggio=formaggio;
	}
	
	//COSTRUTTORE CHA HA 2 PARAMETRI
	Pizza(String impasto, String salsa){
		this.impasto=impasto;
		this.salsa=salsa;
	}
	
	//COSTRUTTORE HA 1 PARAMETRO
	Pizza(String impasto){
		this.impasto=impasto;
	}
	
	//COSTRUTTORE SENZA PARAMETRI
	Pizza(){
	}
}

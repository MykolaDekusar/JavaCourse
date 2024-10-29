
public class Main {

	public static void main(String[] args) {
		//Metodo = blocco di codice che viene eseguito quando il metodo viene richiamato
		//tra le parentesi possiamo passarle delle variabili
		String nome="Nico";
		int eta = 18;
		hello(nome,eta);
		int x=20;
		int y=12;
		System.out.println(calcolo(x,y));
	}
	//solitamente static non dobbiamo metterlo ma in questo caso siccome
	//lo stiamo usando dentro static void main allora dobbiamo metterlo anche per hello
	//il tipo void non ha nessun return cioè non restituisce dati
	static void hello(String nome, int eta) {
		System.out.println("Hello!!! "+nome);
		System.out.println("Hai "+eta+" anni");
	}
	//creiamo un metodo che ci restituisce la somma di 2 numeri interi
	static int calcolo(int a,int b) {
		return a+b;
	}

}

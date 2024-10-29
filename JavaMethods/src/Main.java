
public class Main {

	public static void main(String[] args) {
		//Metodo = blocco di codice che viene eseguito quando il metodo viene richiamato
		//tra le parentesi possiamo passarle delle variabili
		String nome="Nico";
		int eta = 18;
		hello(nome,eta);
	}
	//solitamente static non dobbiamo metterlo ma in questo caso siccome
	//lo stiamo usando dentro static void main allora dobbiamo metterlo anche per hello
	//il tipo void non ha nessun return cioè non restituisce dati
	static void hello(String nome, int eta) {
		System.out.println("Hello!!! "+nome);
		System.out.println("Hai "+eta+" anni");
	}

}


public class Main {

	public static void main(String[] args) {
		//Ovreloaded methods = sono metodi che condividono lo stesso nome ma hanno
		//                     parametri diversi
		//nome metodo + parametri = firma del metodo
		int a = 10;
		int b=5;
		int c=2;
		somma(a,b);
		somma(a,b,c);
 	}
	//primo metodo di sovraccarico
	static int somma(int x, int y) {
		return x+y;
	}
	//secondo metodo di sovraccarico
	static int somma(int x, int y, int z) {
		return x+y+z;
	}

}

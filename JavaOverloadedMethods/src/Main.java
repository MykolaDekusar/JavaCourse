
public class Main {

	public static void main(String[] args) {
		//Ovreloaded methods = sono metodi che condividono lo stesso nome ma hanno
		//                     parametri diversi
		//nome metodo + parametri = firma del metodo
		int a = 10;
		int b=5;
		int c=2;
		System.out.println(somma(a,b));
		System.out.println(somma(a,b,c));
		//cambiamo il valore primitivo
		double x=2.342;
		double z=3.14;
		double l=23.123;
		System.out.println(somma(x,l));
		System.out.println(somma(l,z,x));
 	}
	//primo metodo di sovraccarico
	static int somma(int x, int y) {
		return x+y;
	}
	//secondo metodo di sovraccarico
	static int somma(int x, int y, int z) {
		return x+y+z;
	}
	//cambiando il tipo di dato primitivo da int a double possiamo creare altri metodi
	static double somma (double x, double y) {
		return x+y;
	}
	//
	static double somma(double x, double y, double z) {
		return x+y+z;
	}

}

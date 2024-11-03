public class Amico {
	String nome;
	//creiamo un contatore statico per la classe di Amico
	static int nAmici;
	
	Amico(String nome){
		this.nome = nome;
		//incrementiamo il contatore statico globale di Amico ogni volta che aggiungo un amico
		nAmici++;
	}
	
}


public class Persona {
	String nome;
	int eta;
	Persona(String nome, int eta){
		this.nome= nome;
		this.eta = eta;
	}
	//override del metodo toString
		public String toString() {
			return this.nome + " " + this.eta;
		}
}


public class Macchina {
	String marca="Hyundai";
	String modello="i20N";
	int anno = 2021;
	//sovrascriviamo il metodo toString in modo che ci restituisca una stringa
	public String toString() {
		return marca+"\n"+modello+"\n"+anno;
	}
}

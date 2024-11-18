
public class Auto {
	//creiamo delle variabili private
	private String marca;
	private String modello;
	private int anno;
	//creiamo dei getter e dei setter
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public int getAnno() {
		return anno;
	}
	//creiamo i setter
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	//ora possiamo usare il constructor richiamando i setter
	Auto(String marca, String modello, int anno){
		this.setMarca(marca);
		this.setModello(modello);
		this.setAnno(anno);
	}
	
	
}

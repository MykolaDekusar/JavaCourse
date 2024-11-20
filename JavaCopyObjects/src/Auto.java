
public class Auto {
	private String maker;
	private String model;
	private int year;
	//creo il constructor
	Auto(String maker, String model, int year){
		this.setMaker(maker);
		this.setModel(model);
		this.setYear(year);
	}
	//creo i setter
	public void setMaker(String maker) {
		this.maker=maker;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	//creo i getter
	public String getMaker() {
		return this.maker;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
}

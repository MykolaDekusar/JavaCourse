
public class Main {

	public static void main(String[] args) {
		//inheritance ( eredità) = il processo dove una classe acquisisce gli attributi
		//                         e i metodi di un altra classe
		
		Auto auto = new Auto();
		Moto moto = new Moto();
		//siccome auto e moto ereditano Veicolo abbiamo accesso ai suoi metodi
		auto.vai();
		moto.vai();
		auto.stop();
		moto.stop();
		//ma anche ai metodi e attributi delle singole classi auto e moto
		System.out.println(auto.ruote);
		System.out.println(moto.ruote);
	}

}

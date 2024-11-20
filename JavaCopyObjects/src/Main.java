
public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Chevrolet", "Camaro", 1995);
		System.out.println(auto1.getMaker());
		Auto auto2 = new Auto("Mustang", "Doodge", 2003);
		//applichiamo il metodo copy dove gli passiamo la classe
		auto2.copy(auto1);
		System.out.println(auto2.getMaker());
		//utilizziamo l'overloaded constructor per passarli direttamente la classe
		Auto auto3=new Auto(auto2);
		System.out.println(auto3.getMaker()+", "+ auto3.getModel()+", "+auto3.getYear());
		//
	}

}

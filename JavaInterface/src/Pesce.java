
public class Pesce implements Preda,Predatore{

	@Override
	public void caccia() {
		System.out.println("*Il pesce sta cacciando*");
		
	}

	@Override
	public void scappa() {
		System.out.println("*Il pesce sta scappando*");
		
	}
	
}

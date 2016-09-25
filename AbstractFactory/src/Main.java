
public class Main {
	
	public static void doStuff(Factory fac) throws InstantiationException, IllegalAccessException{
		Product p = fac.makeProduct();
		Thingy t = fac.makeThingy();
		
		
		p.productStuff();
		t.thingyStuff();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Factory facA = new FactoryA();
		Factory facB = new FactoryB();
			
		doStuff(facA);
		doStuff(facB);
		
	}
}

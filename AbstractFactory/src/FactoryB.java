
public class FactoryB extends Factory{

	public FactoryB() throws ClassNotFoundException{
		this.product = Class.forName("ProductB");
		this.thingy = Class.forName("ThingyB");
	}
	
}

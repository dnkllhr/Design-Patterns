
public class FactoryA extends Factory{

	public FactoryA() throws ClassNotFoundException{
		this.product = Class.forName("ProductA");
		this.thingy = Class.forName("ThingyA");
	}
	
}

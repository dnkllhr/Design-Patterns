
public abstract class Factory {
	Class<?> product;
	Class<?> thingy;
	
	public Product makeProduct() throws InstantiationException, IllegalAccessException{
		return (Product) this.product.newInstance();
	}
	
	public Thingy makeThingy() throws InstantiationException, IllegalAccessException{
		return (Thingy) this.thingy.newInstance();
	}
	
}

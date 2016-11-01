
public class Product implements IProduct {

	private IProductPart firstPart;
	private IProductPart secondPart;
	private IProductPart thirdPart;
	public Product() {
		return;
	}
	@Override
	public void installFirstPart(IProductPart part) {
		firstPart = part;
		
	}
	@Override
	public void installSecondPart(IProductPart part) {
		secondPart = part;
		
	}
	@Override
	public void installThirdPart(IProductPart part) {
		thirdPart = part;
		
	}
	

}

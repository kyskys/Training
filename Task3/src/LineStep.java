
public class LineStep implements ILineStep {

	/*public static IProductPart buildProductPart(String name) {
		ProductPart part = new ProductPart();
		part.setProductPartName(name);
		return part;
	}
*/
	@Override
	public IProductPart buildProductPart() {
		ProductPart part = new ProductPart();
		part.setProductPartName("tipo kak to vvesti imya detalki");
		return part;
	}

}

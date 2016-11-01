
public class ProductPart implements IProductPart {
	private String productPartName;
	
	public ProductPart() {
		System.out.println("part ready");
	}
	public String getProductPartName() {
		return productPartName;
	}
	public void setProductPartName(String productPartName) {
		this.productPartName = productPartName;
	}
}
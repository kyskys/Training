
public class AssemblyLine implements IAssemblyLine {

	
	public IProduct assembleProduct(IProduct blank) {
		blank.installFirstPart(LineStep.buildProductPart());
		blank.installSecondPart(LineStep.buildProductPart());
		blank.installThirdPart(LineStep.buildProductPart());
		return blank;
	}

}

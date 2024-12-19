package exercicioPolimorfismo;

public class ImportedProduct extends Product{
	
	private Double custom_fee;	
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double custom_fee) {
		super(name, price);
		this.custom_fee = custom_fee;
	}	
	
	public Double getCustom_fee() {
		return custom_fee;
	}

	public void setCustom_fee(Double custom_fee) {
		this.custom_fee = custom_fee;
	}

	public Double totalPrice() {
		return getPrice() + custom_fee;
	}

	@Override
	public String price_tag() {
		return getName() 
				+ " $ " + String.format("%.2f", totalPrice())
				+ "(Customs fee: $ "
				+ String.format("%.2f", custom_fee)
				+ ")";
	}


}

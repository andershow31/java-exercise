package exercicioPolimorfismo;

public class Product {
	private String name;
	protected Double price;


	public Product(){
		
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String price_tag() {
		return name + " $ " + String.format("%.2f", price);
		
	}	

}

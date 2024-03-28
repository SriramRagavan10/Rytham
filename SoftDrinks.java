package collections1;

public class SoftDrinks {
	private String brand;
	private Float liter;
	private String flover;
	private int price;
	private boolean isGas;
	public SoftDrinks(String brand, Float liter, String flover, int price, boolean isGas) {
		this.brand=brand;
		this.liter=liter;
		this.flover=flover;
		this.price=price;
		this.isGas=isGas;
	}
	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand=brand; }
	public Float getLiter() { return liter; }
	public void setLiter(Float liter) { this.liter=liter; }
	public String getFlover() { return flover; }
	public void setFlover(String flover) { this.flover=flover; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price=price; }
	public boolean getIsGas() { return isGas; }
	public void setIsGas(boolean isGas) { this.isGas=isGas; }
	public String toString() {
		return "Brand=" + brand + ", Liter=" + liter + ", Flover=" + flover + ", Price=" + price
				+ ", Is Gas=" + isGas;
	}
	
}

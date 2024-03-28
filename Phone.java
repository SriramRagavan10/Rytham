package collections1;

public class Phone {
	private String brand;
	private int price;
	private String color;
	private int editionYear;
	private float rating;
	
	public Phone(String brand, int price, String color, int editionYear, float rating) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.editionYear=editionYear;
		this.rating=rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEditionYear() {
		return editionYear;
	}
	public void setEditionYear(int editionYear) {
		this.editionYear = editionYear;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String toString() {
		return "Brand: "+brand+", Price: "+price+", Color: "+color+", Edition Year: "+editionYear+", Rating: "+rating;
	}
}

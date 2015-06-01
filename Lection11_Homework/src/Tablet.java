
public class Tablet extends Device {
	private int price;
	public Tablet(){
		super();
		price = 0;
	}
	public Tablet(String model, String brand, int price){
		super(model, brand);
		setPrice(price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public  void sayModel(){}
	public void sayPrice(){
		System.out.println("My price is: " + this.price);
	}
}
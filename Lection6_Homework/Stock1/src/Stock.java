
public abstract class Stock {
int price;
boolean available;
	public Stock(){
	price = 0;
	available = true;
}
	public Stock(int price, boolean available){
		this.price = price;
		this.available =available;
	}
}

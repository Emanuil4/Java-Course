public class Laptop extends Device{
	private String size;
	public Laptop(){
		super();
		size = " ";
	}
	public Laptop(String model, String brand, String size){
		super(model, brand);
		setSize(size);
	}
	public String getPrice() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public  void sayModel(){}
	public void sayPrice(){
		System.out.println("My size is: " + this.size);
	}
}
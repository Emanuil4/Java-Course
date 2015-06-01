public class Phone extends Device{
	private String color;
	public Phone(){
		super();
		color = " ";
	}
	public Phone(String model, String brand, String color){
		super(model, brand);
		setColor(color);
	}
	public String getColour() {
		return color;
	}
	public void setColor(String colour) {
		this.color = color;
	}
	public  void sayModel(){}
	public void sayColor(){
		System.out.println("My color is: " + this.color);	
	}
}
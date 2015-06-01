public class Device {
	String model;
	String brand;
	public Device(){
		model = " ";
		brand = " ";
	}
	public Device(String model, String brand){
		setModel(model);
		setBrand(brand);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public  void sayModel(){
		System.out.format("Model is: %s ! The brand is: %s", this.model, this.brand);
	}
}

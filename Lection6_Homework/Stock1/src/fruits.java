
public class fruits extends Stock {
	String tropical;
	String colour;
	public fruits(int price, boolean available, String tropical, String colour){
		super(price, available);
		setSort1(tropical);
		setSeason1(colour);
	}
	public void setSort1(String tropical){
		this.tropical = tropical;
	}
	public String getSort1(){
		return tropical;
	}
	public void saySort1(){
		System.out.println("My sort is " + this.tropical);
	}
	public void setSeason1(String colour){
		this.colour = colour;
	}
	public String getSeason1(){
		return colour;
	}
	public void saySeason(){
		System.out.println(". My colour is" + this.colour);
	}

}

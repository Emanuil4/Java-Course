
public class drinks extends Stock {
	String soft;
	String days;
	public drinks(int price, boolean available, String sort, String season){
		super(price, available);
		setSoft(soft);
		setDays(days);
	}
	public void setSoft(String soft){
		this.soft = soft;
	}
	public String getSoft(){
		return soft;
	}
	public void saySoft(){
		System.out.println("I am " + this.soft);
	}
	public void setDays(String days){
		this.days = days;
	}
	public String getDays(){
		return days;
	}
	public void saySeason(){
		System.out.println(". I am active in " + this.days);
	}
}

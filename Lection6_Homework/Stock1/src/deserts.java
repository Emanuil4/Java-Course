
public class deserts extends Stock{
	String type ;
	String days1;
	public deserts(int price, boolean available, String sort, String season){
		super(price, available);
		setType(type);
		setDays1(days1);
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public void sayType(){
		System.out.println("I am " + this.type);
	}
	public void setDays1(String days1){
		this.days1 = days1;
	}
	public String getDays1(){
		return days1;
	}
	public void saySeason(){
		System.out.println(". I must be eaten before " + this.days1);
	}
}



public class meet extends Stock{
	String kind; 
	int callories;
	public meet(int price, boolean available, String kind, int callories){
		super(price, available);
		setKind(kind);
		setCallories(callories);
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	public void sayKind(){
		System.out.println("My kind is " + this.kind);
	}
	public void setCallories(int callories){
		this.callories = callories;
	}
	public int getCallories(){
		return callories;
	}
	public void sayCallories(){
		System.out.println(". I have " + this.kind + "callories.");
	}
}

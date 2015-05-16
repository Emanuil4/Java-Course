
public class Policeman extends Employee {
	String rang;
	public Policeman(){
		super();
		this.rang = "";
	}
	public Policeman (int hoursPerMounth, int salary, String rang){
		super (hoursPerMounth, salary);
		setRang(rang);
	}
	public void setRang(String rang){
		this.rang = rang;
	}
	public String getRang(){
		return rang;
	}
	public void sayRang(){
		System.out.println("My rang is " + this.rang);
	}
}


public class cat {
	String name;
	int years;
	public cat(){
		name = "";
		years = 0;
	}
	public cat (String name, int years){
		this.name = name;
		this.years = years;
	}
	
	public void Say(){
		System.out.print("Hello I am " + this.name + "." );
		System.out.print(" ");
		System.out.println("I am  " + this.years + " years old!");
	}
}

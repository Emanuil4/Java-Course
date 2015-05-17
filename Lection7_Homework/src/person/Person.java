package person;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int years;
	public Person(){
		firstName = "";
		lastName = "";
		years = 0;
	}
	public Person(String firstName, String lastName, int years){
		setFirstName(firstName);
		setLastName(lastName);
		setYears(years);
	}
 public int getYears() {
		return years;
	}
 public void setYears(int years) {
		this.years = years;
	}
 public String getFisrsName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void sayHello(){
		if (this.years < 0){
			System.out.println("I am " + this.firstName + " " + this.lastName + ".I have been working for ??? years.");	
		}else {
			System.out.println("I am " + this.firstName + " " + this.lastName + ".I have been working for "+ this.years + " years. ");
		 }
	}
}


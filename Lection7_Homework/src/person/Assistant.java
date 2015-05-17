package person;

public class Assistant extends Lecturer {
	private String chief;
	public Assistant(){
		super();
		chief = "";
	}
	public Assistant(String firstName ,String lastName ,int years ,String nameOftheUni, String chief){
		super(firstName, lastName, years, nameOftheUni);
		setChief(chief);
	}
	public String getChief() {
		return chief;
	}
 public void setChief(String chief) {
		this.chief = chief;
	}
 	public void sayChief(){
 		System.out.println("I am " + this.chief);
 	}
 	public void write¿rticles(){
 		System.out.println("I am writing  research articles! ");
 	}
 	public void checkingExams(){
 		System.out.println("I check exams! ");
 	}

	
}

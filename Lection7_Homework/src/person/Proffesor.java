package person;

public class Proffesor extends Lecturer {
	String title;
	public Proffesor(){
		super();
		title = "";
	}
	public Proffesor(String firstName ,String lastName ,int years ,String nameOftheUni, String title){
		super(firstName, lastName, years, nameOftheUni);
		setTitle(title);
}
	public String getTitle() {
		return title;
	}
 public void setTitle(String title) {
		this.title = title;
	}
 	public void sayTitle(){
 		System.out.println("My title is " + this.title + ".");
 	}
 	public void sayyear(){
 		System.out.println(" I have 4 years service in the universited. ");
 	}
 	public void sayExams(){
 		System.out.println("I make an exams! ");
 	}
}

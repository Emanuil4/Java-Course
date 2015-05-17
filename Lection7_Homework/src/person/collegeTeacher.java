package person;

public class collegeTeacher extends Teacher {
	private String nameOfCollege;
	public collegeTeacher(){
		super();
		nameOfCollege = "";
	}
	public collegeTeacher(String firstName ,String lastName ,int years ,String subject, String nameOfCollege){
		super(firstName , lastName ,years , subject);
		setCollege(nameOfCollege);
	}
	public String getCollege() {
		return nameOfCollege;
	}
 public void setCollege(String nameOfCollege) {
		this.nameOfCollege = nameOfCollege;
	}
 public void sayCollege(){
	 System.out.println("I work in " + this.nameOfCollege);
 }
}

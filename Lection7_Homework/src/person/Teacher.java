package person;

public class Teacher extends Person{
	String subject;
	public Teacher(){
		super();
		subject = "";
	}
		public Teacher(String firstName ,String lastName ,int years ,String subject){
			super(firstName, lastName, years);
			setSubject(subject);
		}
		public String getSubject() {
			return subject;
		}
	 public void setSubject(String subject) {
			this.subject = subject;
		}
	 public void saySubject(){
		 System.out.println("My subject is: " + this.subject + ".");
	 }
	 public void sayHomework(){
		 System.out.println("I check homeworks! ");
	 }
	 public void sayGood(){
		 System.out.println("Good afternoon ");
	 }
	 public void sayBye(){
		 System.out.println("Bye, bye! ");
	 }
	 public void sayFun(){
		 
	 }
	 public void sayCollege(){
		 
	 }
	 public void sayMas1(){
		 
	 }
	
}

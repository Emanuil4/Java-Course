package person;

public class Lecturer extends Person{
	String nameOfTheUni;
	public Lecturer(){
		nameOfTheUni = "";
	}
		public Lecturer(String firstName ,String lastName ,int years ,String nameOfTheUni){
			super(firstName, lastName, years);
			setnameOfTheUni(nameOfTheUni);
		}
		public String getnameOfTheUni() {
			return nameOfTheUni;
		}
	 public void setnameOfTheUni(String nameOfTheUni) {
			this.nameOfTheUni = nameOfTheUni;
		}
	 public void sayGoodAfternoon(){
		 System.out.println("Good Afternoon! ");
	 }
	 public void sayName1(){
		 System.out.println("The name of the university is " + this.nameOfTheUni + ".");
	 }
	 public void sayCheck(){
		 System.out.println("I check exercises! ");
	 }
	 public void sayCheck(int a){
		 a = 5;
		 System.out.println("I check exercises "+ a + " times per week! ");
	 }
	 public void sayCheck(String b){
		 b = "Ivan";
		 System.out.println("I Check "+ b + "'s homework 5 times per week! ");
	 }
	 public final void sayMax(){
			System.out.println("I have maximum 10 lection per week!");
		}
	 public void sayChief(){
		 
	 }
	 public void write¿rticles(){
		 
	 }
	 public void checkingExams(){
		 
	 }
	 public void sayExams(){
		 
	 }
	 public void sayTitle(){
		 
	 }
	 }


package person;

public class schoolTeacher extends Teacher {
	String mas1;
	public schoolTeacher(){
		super();
		mas1 = "";
	}
	public schoolTeacher(String firstName ,String lastName ,int years ,String subject ,String mas1){
		super(firstName , lastName, years, subject);
		setMas1(mas1);
	}
	public String getMas1() {
		return mas1;
	}
 public void setMas1(String mas1) {
		this.mas1 = mas1;
	}
 	public void sayMas1(){
 			if (mas1 == "1"){
 				System.out.println("I am working with 1A class! ");
 			}
 			if (mas1 == "2"){
 		 		System.out.println("I am working with 2B class! ");
 		 	}
 			if (mas1=="3"){
 		 		System.out.println("I am working with 3V class! ");
 		 			}
 			if (mas1 == "4"){
 		 		System.out.println("I am working with 4D class! ");
 		 			}
 			if (mas1 == "5"){
 		 		System.out.println("I am working with 5E class! ");
 		 			}
 		}
	public void sayFun(){
		System.out.println("I can make a lot of funn! ");
	}
}

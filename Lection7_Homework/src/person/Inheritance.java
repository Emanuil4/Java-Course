package person;
public class Inheritance {
	public static void main(String[] args) {
		int a = 0;
		String sayHello = "sayHello";
		Lecturer Ivan = new Assistant("Ivan", "Todorov", -1, "\"YNSS\"", "Chief assistant.");
		Ivan.sayHello();
		Ivan.sayName1();
		Ivan.sayChief();
		Ivan. write�rticles();
		Ivan.checkingExams();
		System.out.println();
		System.out.println("====================================");
		Lecturer Borislav = new Assistant("Borislav", "Draganov", 2, "\"Plovdiv university\"", " not chief assistant.");
		Borislav.sayHello();
		Borislav.sayName1();
		Borislav.sayChief();
		Borislav. write�rticles();
		Borislav.checkingExams();
		System.out.println();
		System.out.println("====================================");
		Lecturer Petur = new Proffesor("Petur", "Ivanov", 7, "\"Sofia university\"", "Professor");
		Petur.sayHello();
		Petur.sayName1();
		Petur.sayTitle();
		Petur.sayExams();
		System.out.println();
		System.out.println("====================================");
		Lecturer Stoyan = new Lecturer("Stoyan", "Petrov", 9, "\"YNSS\"");
		Stoyan.sayGoodAfternoon();
		Stoyan.sayHello();
		Stoyan.sayName1();
		Stoyan.sayCheck();
		Stoyan.sayCheck(0);
		Stoyan.sayCheck(null);
		Stoyan.sayMax();
		System.out.println();
		System.out.println("====================================");
		Teacher Snejana = new Teacher ("Snejana", "Kirova", 10, "French");
		Snejana.sayGood();
		Snejana.sayHello();
		Snejana.saySubject();
		Snejana.sayHomework();
		Snejana.sayBye();
		System.out.println();
		System.out.println("====================================");
		Teacher Denis = new collegeTeacher("Denis", "Georgiev", 8, "Spanish", "\"YNSS\"");
		Denis.sayHello();
		Denis.saySubject();
		Denis.sayCollege();
		Denis.sayHomework();
		System.out.println();
		System.out.println("====================================");
		Teacher Mirela = new schoolTeacher("Mirela", "Todorova", 12, "English", "1");
		Mirela.sayHello();
		Mirela.saySubject();
		Mirela.sayCollege();
		Mirela.sayMas1();
		Mirela.sayFun();
		System.out.println();
		System.out.println("====================================");
		Teacher Dinko = new schoolTeacher("Dinko", "Tenev", 15, "English", "3");
		Dinko.sayHello();
		Dinko.saySubject();
		Dinko.sayCollege();
		Dinko.sayMas1();
		Dinko.sayFun();
		System.out.println();
		System.out.println("====================================");
	}
}
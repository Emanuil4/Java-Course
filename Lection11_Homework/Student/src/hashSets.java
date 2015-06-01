
import java.util.HashSet;
public class hashSets {

	public static void main(String[] args) {
		Student Ivan = new Student("Ivan", "Georgiev " , "386743");
		Student Georgi = new Student("Georgi", "Minchev " , "4897897");		
		Student Stoyan = new Student("Stoyan", "Slavov ", "542346");
		Student Mitko = new Student("Mitko", "Penchev ", "626788");
		Student Ivona = new Student("Ivona", "Dimitrova ", "578090903");
		HashSet<Student> students = new HashSet<Student>();
		students.add(Ivan);
		students.add(Georgi);
		students.add(Stoyan);
		students.add(Mitko);
		students.add(Ivona);
		System.out.println(students);
		System.out.println();
	//	public static void addSubjectMark(){
			
		//}
	}
}

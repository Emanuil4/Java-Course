
public class Employee {
	int hoursPerMounth;
	int salary;

 public Employee() {
	 this.hoursPerMounth = 0;
	 this.salary = 0;
 }
 public Employee(int hoursPerMounth, int salary){
		this();
		
		setHoursPerMounth(hoursPerMounth);
		setSalary(salary);
	}
 public int getHoursPerMounth() {
		return hoursPerMounth;
	}
 public void setHoursPerMounth(int hoursPerMounth) {
		this.hoursPerMounth = hoursPerMounth;
	}
 public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void sayHello(){
		System.out.println("Hello I work " +  this.hoursPerMounth + " hours");
		System.out.println("My salary is " +  this.salary + " lv");
	}
}
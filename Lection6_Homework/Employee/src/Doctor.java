
public class Doctor extends Employee {
 int nightHours;
 int dayHours;

public Doctor(){
	super();
	nightHours = 0;
	dayHours = 0;
}
public Doctor(int hoursPerMounth, int salary, int nightHours, int dayHours){
	super (hoursPerMounth, salary);
	setNight(nightHours);
	setDays(dayHours);
}
	public void  setNight(int nightHours){
		this.nightHours = nightHours;
	}
	public int getNigth(int dayHours) {
		return dayHours;
	}
	public void setDays(int daytHours){
		this.dayHours = dayHours;
	}
	public int getDays(int dayHours) {
		return dayHours;
	}
	public void sayNigth(){
		System.out.println("Number of my night hours is: " + this.nightHours);
	}
	public void sayDay(){
		System.out.println("Number of my days hours is: " + this.dayHours);
	}
}
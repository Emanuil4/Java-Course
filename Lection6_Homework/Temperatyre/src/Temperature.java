
public class Temperature {
	double gradus;
	double fahrenheit;
	public Temperature(){
		gradus = 0;
		fahrenheit = 0;
	}
	public double ConvertfromCelsius (double gradus){
		fahrenheit =  (gradus * 2) + 30;
		return fahrenheit;
	}
}

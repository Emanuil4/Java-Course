
public class Automobile extends Car {
	 int fuel;
//	 public  Automobile(){
//		 super(price);
//		 fuel = 0;
//	 }
	 public Automobile(int price, int fuel){
		 super (price);
		 setFuel(fuel);
	 }
	 public void setFuel(int fuel){
		 this.fuel = fuel;
	 }
	 public int getFuel(){
			return fuel;
		}
		public void sayFuel(){
			System.out.println(" .I burn " + this.fuel + " l/100km.");
		}
}

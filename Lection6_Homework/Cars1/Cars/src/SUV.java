
public class SUV extends Car {
	boolean allRoad;
	public SUV(){
		super();
		this.allRoad = true;
	}
	public SUV(int price, boolean allRoad){
		super(price);
		setAllRoad(allRoad);
	}
	public boolean AllRoad(){
		return allRoad;
	}
	public void setAllRoad(boolean allRoad){
	this.allRoad = allRoad;
	}
	public void sayAllRoad(){
		System.out.println(" The automobile is offroad " + this.allRoad);
	}
}

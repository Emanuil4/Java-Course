package homework10_town;
import java.util.HashMap;
import java.util.HashSet;
public class Sets {

	public static void main(String[] args) {
		town Varna = new town("Varna", "Bulgaria " , 33000);
		town London = new town("London", "England " , 400000);		
		town Paris = new town("Paris", "France ", 500000);
		HashSet<town> towns = new HashSet<town>();
		towns.add(Varna);
		towns.add(London);
		towns.add(Paris);
		System.out.println(towns);
		System.out.println();
		System.out.println(towns.contains(Varna));
		System.out.println();
		towns.remove(Varna);
		System.out.println(towns);
	}

}

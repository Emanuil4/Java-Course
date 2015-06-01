import java.util.HashMap;
public class hashMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("History", 5);
		grades.put("Math", 5);
		grades.put("English", 6);
		grades.put("Biology", 6);
		grades.put("Sport", 6);
		for (String key : grades.keySet()) {
			System.out.println("" + key + " -> " + grades.get(key));
		}

	}

}

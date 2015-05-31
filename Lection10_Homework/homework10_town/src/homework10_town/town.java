package homework10_town;

public class town{
	String name;
	String country;
	int population;
	public town(String name, String country, int population){
		setName(name);
		setCountry(country);
		setPopulation(population);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	 public boolean equals(Object o){
	    if(o == null){
	    	return false;
	    }
	    
	    if(!(o instanceof town)){
	    	return false;
	    }

	    town name1 = (town) o;
	    return this.hashCode() == name1.hashCode();
	  }public String toString(){
		  return this.name + " " + this.country + this.population;
	  }
}


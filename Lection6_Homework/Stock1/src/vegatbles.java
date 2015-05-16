
public class vegatbles extends Stock{
	String sort;
	String season;
	public vegatbles(int price, boolean available, String sort, String season){
		super(price, available);
		setSort(sort);
		setSeason(season);
	}
	public void setSort(String sort){
		this.sort = sort;
	}
	public String getSort(){
		return sort;
	}
	public void saySort(){
		System.out.println("My sort is " + this.sort);
	}
	public void setSeason(String season){
		this.season = season;
	}
	public String getSeason(){
		return season;
	}
	public void saySeason(){
		System.out.println(". I am active in " + this.season);
	}
}

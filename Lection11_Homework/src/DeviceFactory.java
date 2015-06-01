import java.util.Scanner;
	public class DeviceFactory {
	public static void main(String[] args) {
	
	}		
	public Device createModel(){
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter word: ");
		String deviceType = input.nextLine();
			 if(deviceType == null){
				 return null;
			 }
			 
			 if(deviceType.equalsIgnoreCase("Tablet")){
				 return new Tablet();
			 } else if(deviceType.equalsIgnoreCase("Phone")){
				 return new Phone();
			 } else if(deviceType.equalsIgnoreCase("Laptop")){
				 return new Laptop();
			 }
			 	return null;
			 }	
	}
	


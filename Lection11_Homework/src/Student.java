

	public class Student {
		String firstName;
		String lastName;
		String number;
		public Student(String firstName, String lastName, String number){
			setFirstName(firstName);
			setLastName(lastName);
			setNumber(number);
		}
		public String getFristName() {
			return firstName;
		}
		public void setFirstName(String fristName) {
			this.firstName = fristName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		} public String toString(){
			return this.firstName + " " + this.lastName + " " + this.number;
		}
	}


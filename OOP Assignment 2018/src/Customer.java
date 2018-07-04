public class Customer extends Person{
	public Customer() {
		
	}
	
	public Customer(int ID, String name, String gender, String email, int contactNumber) {
		ID = super.ID;
		name = super.name;
		gender = super.gender;
		email = super.email;
		contactNumber = super.contactNumber;
	}
}

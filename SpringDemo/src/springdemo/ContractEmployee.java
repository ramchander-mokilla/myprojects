package springdemo;

public class ContractEmployee extends Employee{

	int payPerHour;
	int rating;
	
	public ContractEmployee() {
		
	}
	
	public ContractEmployee(int payPerHour, int rating) {
		
		this.payPerHour = payPerHour;
		this.rating = rating;
	}
	
	public ContractEmployee(Address address) {
		
		super(address);
	}
	
	public int getPayPerHour() {
		return payPerHour;
	}
	
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", rating=" + rating + "]\n"+super.toString();
	}	
}

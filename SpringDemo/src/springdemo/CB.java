package springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	CA ca;
	
	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		this.ca = ca;
	}

	public void showB(){
		
		System.out.println("In showB() method");
		
	}

}

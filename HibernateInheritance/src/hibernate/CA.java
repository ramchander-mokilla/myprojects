package hibernate;

public class CA {

	int id;
	int a;
	
	public CA() {
	
	}
	
	public CA(int id, int a) {
		this.id = id;
		this.a = a;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}	
}

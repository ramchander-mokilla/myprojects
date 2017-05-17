package inheritance;

public class GrandChild extends Child{

	public static void main(String[] args) {
		
		GrandChild grandChild = new GrandChild();
		grandChild.getAddress();
		grandChild.getOccupation();
		grandChild.getIncome();
		System.out.println("Age = "+grandChild.age);
	}

}

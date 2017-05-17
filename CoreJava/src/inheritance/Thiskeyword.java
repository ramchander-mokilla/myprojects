package inheritance;

public class Thiskeyword {

	int a = 60;
	
	public void getData()
	{
		int a = 30;
		System.out.println(a); //scope = getData method, this points to the variable defined in this method
		System.out.println(this.a); //scope = class level, this points to the variable defined in the class
	}
	
	public static void main(String[] args) {
		
		Thiskeyword tkw = new Thiskeyword();
		tkw.getData();
	}
}

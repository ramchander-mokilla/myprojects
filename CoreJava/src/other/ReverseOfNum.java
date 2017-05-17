package other;
import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		int y = x;
		
		int iRemainder, iReverse=0;
		
		for (;x > 0; x = x/10)
		{
			iRemainder = x%10;
			iReverse = iReverse*10 + iRemainder;
		}
		System.out.println("Reverse of the number is "+ iReverse);
		sc.close();
		System.out.println("Square of the number is "+ y*y);
	}
}

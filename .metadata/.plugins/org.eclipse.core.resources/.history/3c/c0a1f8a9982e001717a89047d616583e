package other;
import java.util.Scanner;

public class AddDigitsOfANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int rem, sum=0;
		
		for (;x > 0; x = x / 10)
		{
			rem = x % 10;
			sum = sum + rem;
		}
		System.out.println("Sum of digits of the number is "+sum);
		sc.close();
	}

}

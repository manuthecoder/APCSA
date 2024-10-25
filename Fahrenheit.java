import java.util.*;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the fahrenheit value :: ");

		double f = kb.nextDouble();
		double res = ((f - 32) * 5) / 9;

		String rounded = String.format("%.2f", res);
		System.out.println(rounded + " degrees Celcius");
	}
}

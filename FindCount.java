import java.util.*;

public class FindCount {
	public static void main(String[] args) {
		String name = "Faten Sakallah";
		int count = 0;
		for (int x = 0; x < name.length(); x++) {
			String let = name.substring(x, x + 1);
			if (let.equalsIgnoreCase("e")) {
				count++;
			}
		}
		System.out.println(count);
	}
}

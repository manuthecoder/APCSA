import static java.lang.System.*;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter a year :: ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        boolean isLeapYear = (input % 400 == 0) || ((input % 4 == 0) && (input % 100 != 0));

        String middle;
        if (isLeapYear)
            middle = " is ";
        else
            middle = " is NOT ";

        System.err.println(input + middle + "a leap year");
        scanner.close();
    }
}

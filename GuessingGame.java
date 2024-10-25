import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 21);

        System.out.print("Guess a number between 0 and 20: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        System.out.println(guess == x ? "Correct!" : "Sorry, that is not the correct answer, " + x);
        input.close();
    }
}

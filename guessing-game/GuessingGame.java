import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int x;
        boolean tried = false;
        final int SECRET_NUMBER = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number: ");
        x =  scanner.nextInt();
        tried = true;

        if (tried) {
            while (x != SECRET_NUMBER) {
                System.out.print((x > SECRET_NUMBER ? "Too high" : "Too low") + ", try again: ");
                x =  scanner.nextInt();
            }
        }

        scanner.close();

        System.out.println("You won!");
    }
}

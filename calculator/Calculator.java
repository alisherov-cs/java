import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter number y: ");
        double y = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        String operation = scanner.next();

        scanner.close();

        double result = operate(x, y, operation);
        System.out.println("res: " + result);
    }

    static double operate(double x, double y, String operation) {
        switch (operation) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                return x + y;
        }
    }
}

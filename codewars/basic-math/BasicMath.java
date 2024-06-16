public class BasicMath {
    public static int solution(String operation, int x, int y) {
        switch (operation) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            default:
                return x / y;
        }
    }
}

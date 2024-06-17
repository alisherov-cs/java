public class DRoot {
    public static int solution(int num) {
        int res = 0;

        while (num != 0) {
            res = res + num % 10;
            num = (num - (num % 10)) / 10;
        }

        return res / 10 > 0 ? solution(res) : res;
    }
}

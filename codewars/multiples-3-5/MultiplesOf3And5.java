public class MultiplesOf3And5 {
    public static int solution(int number) {
        int res = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) {
                res += i;
            } else if (i % 5 == 0) {
                res += i;
            }
        }

        return res;
    }
}

public class Summation {
    public static int solution(int num) {
        int res = 0;
        
        for (int i = 1; i <= num; i++) {
            res = res + i;
        }

        return res;
    }
}

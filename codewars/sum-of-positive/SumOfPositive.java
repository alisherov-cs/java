public class SumOfPositive {
    public static int solution(int[] nums) {
        int res = 0;

        for (int num : nums) {
            if (num > 0) {
                res = res + num;
            }
        }

        return res;
    }
}

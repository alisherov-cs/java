public class CalculateAvarage {
    public static double solution(int[] nums) {
        double sum = 0.0;

        for (int num : nums) {
            sum = sum + num;
        }

        return sum / nums.length;
    }
}

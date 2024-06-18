import java.util.Arrays;

public class FindTheUnique {
    public static double solution(double[] nums) {
        double[] sorted = Arrays.stream(nums).sorted().toArray();
        return sorted[0] == sorted[1] ? sorted[sorted.length - 1] : sorted[0];
    }
}

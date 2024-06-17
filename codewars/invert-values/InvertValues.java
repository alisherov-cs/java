import java.util.Arrays;

public class InvertValues {
    public static int[] solution(int[] nums) {
        return Arrays.stream(nums).map(x -> x * -1).toArray();
    }
}

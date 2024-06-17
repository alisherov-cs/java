import java.util.List;

public class MixedArray {
    public static int solution(List<?> mixed) {
        int res = 0;

        for (int i = 0; i < mixed.toArray().length; i++) {
            res = res + Integer.parseInt(mixed.toArray()[i].toString());
        }

        return res;
    }
}

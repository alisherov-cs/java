import java.util.Arrays;

public class WordSearch {
    public static String[] solution(String query, String[] words) {
        String[] res = Arrays.stream(words).filter(x -> x.toLowerCase().contains(x.toLowerCase())).toArray(String[]::new);
        String[] empty = { "Empty" };
        return res.length > 0 ? res : empty;
    }
}

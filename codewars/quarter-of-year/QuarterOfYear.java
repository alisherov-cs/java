public class QuarterOfYear {
    public static int solution(int month) {
        int quarter = 0;
        int quarterMonth = 0;

        while (quarterMonth < month) {
            quarter = quarter + 1;
            quarterMonth = quarterMonth + 3;
        }

        return quarter;
    }
}

public class ReverseString {
    public static String solution(String str) {
        String res = "";
        String[] strArr = str.split("");

        for (int i = strArr.length; i > 0; i--) {
            res = res + strArr[i - 1];
        }

        return res;
    }
}

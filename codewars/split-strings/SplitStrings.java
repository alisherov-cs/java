public class SplitStrings {
    public static String[] solution(String str) {
        String[] strArray = (str.length() % 2 == 0 ? str : str + "_").split("");
        String[] res = new String[strArray.length / 2];

        int index = 0;
        for (int i = 0; i < strArray.length - 1; i = i + 2) {
           res[index] = strArray[i] + strArray[i + 1]; 
           index++;
        }

        return res;
    }
}

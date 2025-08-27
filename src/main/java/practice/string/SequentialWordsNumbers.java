package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        String result = "";
        int index = 1;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0) {
                result += "(" + index + ") ";
                index++;
            }
                if (text.charAt(i) == ' ') {
                    result += " (" + index + ") ";
                    index++;
                    continue;
                }
                result += text.charAt(i);
            }
            return result;
    }
}


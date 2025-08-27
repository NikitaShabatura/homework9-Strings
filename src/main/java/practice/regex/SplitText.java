package practice.regex;

public class SplitText {

  public static void main(String[] args) {


  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    if (text.isEmpty()) {
      return "";
    }
    String result = "";
    String regex = "[^A-Za-z\\s]";
    String textRegex = text.replaceAll(regex, "");
    String[] words = textRegex.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      if (i == words.length) {
        result += words[i];
        continue;
      }
      result += words[i] + System.lineSeparator();
    }
    return result.strip();
  }

}
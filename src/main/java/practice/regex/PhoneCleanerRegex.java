package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }


      // TODO:напишите ваш код тут, результат вывести в консоль.
      String regex = "[^0-9]";
      String regexPhoneNumber = input.replaceAll(regex, "");

      if (regexPhoneNumber.length() > 11) {
        System.out.println("Неверный формат номера");
        break;
      }

      if (regexPhoneNumber.length() < 10) {
        System.out.println("Неверный формат номера");
        break;
      }

      if (regexPhoneNumber.length() == 10) {
        regexPhoneNumber = 7 + regexPhoneNumber;
      }

      if (regexPhoneNumber.substring(0, 1).equals("8")) {
        regexPhoneNumber = 7 + regexPhoneNumber.substring(1);
      }

      if (!regexPhoneNumber.substring(0, 1).equals("7")) {
        System.out.println("Неверный формат номера");
        break;
      }

      System.out.println(regexPhoneNumber);
    }
  }

}

package Services;

import java.util.Scanner;

public class ScannerService {
  public static ScannerService make() {
    return new ScannerService();
  }

  public String scanStringWithPrompt(String prompt) {
    System.out.print(prompt);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public char scanCharWithPrompt(String prompt) {
    System.out.print(prompt);
    Scanner scanner = new Scanner(System.in);
    return scanner.next().charAt(0);
  }

}
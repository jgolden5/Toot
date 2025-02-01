package main;

import java.util.Scanner;

public class ScannerWithPrompt {
  public static String exec(String prompt) {
    System.out.print(prompt);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}

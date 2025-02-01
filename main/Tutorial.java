package main;

import java.util.Scanner;

public class Tutorial {
  private String title;
  private Lesson[] lessons;

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void addLesson() {
    System.out.print("New lesson title: ");
    Scanner scanner = new Scanner(System.in);
    String lessonTitle = scanner.nextLine();
    System.out.println(lessonTitle);
  }

}
package src;

import Services.FileService;

import java.util.Scanner;

public class Tutorial {
  private String title;
  private Lesson[] lessons;

  private static final FileService fs = ServiceHolder.fileService;

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

  public void saveTutorialName() {
    fs.mkdirs("Tutorials/" + title + "/Lessons");
  }

  public void printInfo() {
    System.out.println("Tutorial Title = " + title);

  }

}
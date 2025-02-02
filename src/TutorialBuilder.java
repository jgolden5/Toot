package src;

import Services.FileService;
import Services.ScannerService;

abstract public class TutorialBuilder {
  private static final ScannerService ss = ServiceHolder.scannerService;
  private static final FileService fs = ServiceHolder.fileService;
  public static void build() {
    listTutorialBuildOptions();
    char command = ss.scanCharWithPrompt("Enter command here: ");
    switch (command) {
      case 'e' -> chooseTutorialToEdit();
      case 'n' -> newTutorial();
      default -> System.out.println("Sorry, command " + command + " was not recognized");
    }
  }

  private static void chooseTutorialToEdit() {
    System.out.println(fs.ls("Tutorials"));
    String nameOfTutorialToEdit = ss.scanStringWithPrompt("Which tutorial would you like to edit? ");
    Tutorial t = loadTutorial(nameOfTutorialToEdit);
  }

  private static Tutorial loadTutorial(String nameOfTutorialToEdit) {
    Tutorial t = new Tutorial();
    return t;
  }

  private static void newTutorial() {
    Tutorial t = new Tutorial();
    String tutorialTitle = ss.scanStringWithPrompt("Enter your tutorial title: ");
    t.setTitle(tutorialTitle);
    System.out.println("Tutorial title = " + t.getTitle());
    t.saveTutorialName();
  }

  private static void buildLesson(Tutorial t) {
    System.out.println("Time to build a lesson!");
  }

  public static void listTutorialBuildOptions() {
    System.out.println("e = Edit exiting tutorial");
    System.out.println("t = Make new tutorial");
  }
}
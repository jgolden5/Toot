package main;

public class TutorialBuilder {
  public void buildTutorial() {
    Tutorial t = new Tutorial();
    String tutorialName = ScannerWithPrompt.exec("Enter your tutorial name: ");
    t.setTitle(tutorialName);
    System.out.println("Tutorial title = " + t.getTitle());
  }
}

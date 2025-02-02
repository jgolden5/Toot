package Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

 public class FileService {
  public static void write(String text, String filepath) throws IOException {
    try(FileWriter writer = new FileWriter(filepath)) {
      writer.write(text);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void mkdirs(String folderPath) {
    File folder = new File(folderPath);
    if(folder.mkdirs()) {
      System.out.println("folder " + folderPath + " was added successfully");
    } else {
      System.out.println("folder " + folderPath + " was not added successfully");
    }
  }

  public static String ls(String currentDirName) {
    File currentDir = new File(currentDirName);
    File[] files = currentDir.listFiles();
    String fileNamesAsString = "";
    if(files != null) {
      for(File f : files) {
        fileNamesAsString += f.getName() + "\n";
      }
    }
    return fileNamesAsString;
  }

  public static FileService make() {
    return new FileService();
  }
}

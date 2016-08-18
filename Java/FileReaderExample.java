
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
 
public class MyFiles {
     
     
  public String readFile(String nameFile) {
     
    String stringreturn = "";
    FileReader files = null;
    String lines = "";
    
    try {
      files = new FileReader(nameFile);
      BufferedReader reader = new BufferedReader(files);
      while ((lines = reader.readLine()) != null) {
        stringreturn += lines + "\n";
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException("File not found");
    } catch (IOException e) {
      throw new RuntimeException("IO Error occured");
    } finally {
      if (files != null) {
        try {
          files.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return stringreturn;
  }
 
  public void writefile(String nameFile, String text) {
    FileWriter testoutput = null;
    
    try {
      testoutput = new FileWriter(nameFile);
      BufferedWriter writer = new BufferedWriter(testoutput);
      writer.write(text);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (testoutput!= null) {
        try {
          testoutput.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
 
  }
}

public class FileReaderExample {
 

 public static void main(String[] args) {
     
        MyFiles FILE = new MyFiles();
        String testinput =  FILE.readFile("test.txt");
        System.out.println(testinput);
        FILE.writefile("test2.txt", testinput);
}

}s
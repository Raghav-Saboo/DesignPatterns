package template.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

  public static String readStringInput() {
    String answer = null;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO error trying to read your answer");
    }
    return answer;
  }
}

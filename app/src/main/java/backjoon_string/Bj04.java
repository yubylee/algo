package backjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj04 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    char c = str.charAt(0);
    System.out.println((int)c);

  }
}

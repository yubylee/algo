package backjoon_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj01 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A = Integer.parseInt(br.readLine());
    int result = 0;
    br.close();
    for(int i = 1; i<10; i++) {
      result=A*i;
      System.out.println(A + " X " + i + " = " + result);
    }
  }

}

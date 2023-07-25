package backjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj03 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      sb.append(str.charAt(0));
      sb.append(str.charAt(N - 1) + "\n");
    }
    System.out.print(sb);
  }
}

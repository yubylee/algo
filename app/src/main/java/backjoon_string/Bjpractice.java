package backjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bjpractice {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

    System.out.println(A > B ? A : B);
  }
}

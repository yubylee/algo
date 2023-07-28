package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj02p {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int A, B;
    A =Integer.parseInt(st.nextToken());
    B =Integer.parseInt(st.nextToken());

    System.out.print(A + B);
  }
}

package backjoon_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj01 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int N = Integer.parseInt(br.readLine());

    //    System.out.println(str.charAt(N-1));
    System.out.println(str.substring(N-1,N));
  }
}

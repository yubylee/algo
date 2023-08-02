package beakjoon_intensify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ03 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      for(int k = N-i; k >= 0; k--) {
        System.out.print(" ");
      }
      for(int j =  1; j <= i*2-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = N-1; i > 0; i--) {
      for(int k = N-i; k >= 0; k--) {
        System.out.print(" ");
      }
      for(int j =  1; j <= i*2-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

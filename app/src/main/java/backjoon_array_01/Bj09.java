package backjoon_array_01;

import java.util.Scanner;

public class Bj09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();

    int[] arr = new int[N+1];

    for(int i = 1; i <= N; i++) {
      arr[i] = i;
    }

    for(int k = 0; k < M; k++) {
      int i = scan.nextInt();
      int j = scan.nextInt();

      for(int h = i; h <= j; h++) {
        int nn = j--;

        int temp = arr[h];
        arr[h] = arr[nn];
        arr[nn] = temp;
      }
    }
    for(int i = 1; i <= N; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}

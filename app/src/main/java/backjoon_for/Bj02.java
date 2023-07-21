package backjoon_for;

import java.util.Scanner;

public class Bj02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int c = scan.nextInt();
    int arr[] = new int[c];

    for(int i = 0; i < c; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      arr[i] = a+b;
    }

    for(int k : arr) {
      System.out.println(k);
    }
  }
}

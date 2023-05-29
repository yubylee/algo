package app_10;

import java.util.Scanner;

public class Main4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int num = 1;

    for(int j = 0; j < n; j++) {
      for(int i = 0; i < n; i++) {
        System.out.printf("%4d", num);
        num++;
      }
      System.out.println();
    }

  }
}

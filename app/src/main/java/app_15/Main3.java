package app_15;

import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int s = scan.nextInt();
    int h = scan.nextInt();

    for(int i = 1; i <= 9; i++) {
      for (int j = s; j <= h; j++) {
        System.out.printf("%2d *%2d =%3d", j, i, j*i);
      }
      System.out.println();
    }

  }
}

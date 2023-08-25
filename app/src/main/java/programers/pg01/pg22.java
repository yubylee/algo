package programers.pg01;

import java.util.Scanner;

// 직각삼각형 출력하기
public class pg22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}

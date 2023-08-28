package programers.pg01;

import java.util.Scanner;

// 양꼬치
public class pg27 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();

    int answer = 0;
    int halin = n / 10;

    answer = (n * 12000) + (k * 2000) - (halin * 2000);


    System.out.println(answer);
  }
}

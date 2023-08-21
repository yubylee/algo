package programers.pg01;

import java.util.Scanner;
// 숫자를 나누고 1000을 곱한 후 정수값만 출력
public class pg5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    int result = (int) ((int) a / b * 1000);
    System.out.println(result);
  }
}

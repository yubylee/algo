package programers.pg01;

import java.util.Scanner;
// 두수의 값이 같으면 "1", 다름녀 "-1" 출력
public class pg6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    if(a == b) {
      System.out.println("1");
    } else {
      System.out.println("-1");
    }
  }
}

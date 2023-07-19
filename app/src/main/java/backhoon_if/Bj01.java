package backhoon_if;

import java.util.Scanner;

public class Bj01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    if(A > B) {
      System.out.println(">");
    } else if(B > A) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }
  }
}

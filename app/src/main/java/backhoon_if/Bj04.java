package backhoon_if;

import java.util.Scanner;

public class Bj04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();

    if (A>0 && B>0) {
      System.out.println(1);
    } else if(A<0 && B>0) {
      System.out.println(2);
    } else if(A<0 && B<0) {
      System.out.println(3);
    } else {
      System.out.println(4);
    }
  }
}

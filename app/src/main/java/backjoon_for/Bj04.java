package backjoon_for;

import java.util.Scanner;

public class Bj04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A, B, C, D;
    A = scan.nextInt();
    B = scan.nextInt();
    int result = 0;
    for(int i = 0; i < B; i++) {
      C = scan.nextInt();
      D = scan.nextInt();
      result += C*D;
    }
    scan.close();
    if(A == result) {
      System.out.println("Yes");
    }      
    else {
      System.out.println("No");
    }
  }
}

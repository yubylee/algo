package backjoon_for;

import java.util.Scanner;

public class Bj05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    String str = "";
    scan.close();
    for (int i = 0; i < A/4; i++) {
      str += "long ";
    }
    System.out.println(str + "int");
  }
}

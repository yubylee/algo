package backjoon_array_01;

import java.util.HashSet;
import java.util.Scanner;

public class Bj08 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    HashSet<Integer> hs = new HashSet<>();

    for(int i = 0; i < 10; i++) {
      hs.add(scan.nextInt() % 42);
    }
    scan.close();
    System.out.println(hs.size());
  }
}

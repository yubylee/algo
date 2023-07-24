package backjoon_array_01;

import java.util.Scanner;

public class BJ07 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    boolean[] arr = new boolean[31];

    for(int i = 0; i < 28; i++) {
      arr[scan.nextInt()] = true;
    }

    for(int j = 1; j <= 30; j++) {
      if(!arr[j])
        System.out.println(j);
    }
  }
}

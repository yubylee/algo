package programers.pg01;

import java.util.Arrays;
import java.util.Scanner;

// 문자열 정렬하기(1)
public class pg46 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str = scan.nextLine();

    str = str.replaceAll("[a-z]", "");

    String[] arr = str.split("");
    int[] answer = new int[arr.length];

    for(int i = 0; i < arr.length; i++) {
      answer [i] = Integer.parseInt(arr[i]);
    }

    Arrays.sort(answer);

    for(int k : answer) {
      System.out.print(k);
    }
  }
}

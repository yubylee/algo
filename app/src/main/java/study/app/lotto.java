package study.app;

import java.util.Arrays;
import java.util.Random;

public class lotto {
  public static void main(String[] args) {

    Random random = new Random();
    int arr[] = new int[6];
    for(int i = 0; i < 6; i++) {
      arr[i] = random.nextInt(45) + 1;

      for(int j = 0; j < i; j++) {
        if(arr[i] == arr[j]) {
          i--;
          break;
        }
      }
    }
    Arrays.sort(arr);
    for(int k : arr) {
      System.out.print(k + " ");
    }
  }
}

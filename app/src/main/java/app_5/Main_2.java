package app_5;

import java.util.Scanner;

public class Main_2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    char []arr;
    arr = scan.next().toCharArray();

    for(int i=0; i<arr.length; i++) {
      if(arr[i] >= 'a' && arr[i] <= 'z') {
        arr[i] = (char) (arr[i] + 'A' - 'a');
      } else if(arr[i] >= 'A' && arr[i] <= 'Z') {
        arr[i] = (char) (arr[i] - ('A' - 'a'));
      }
    }

    System.out.println(arr);
  }
}

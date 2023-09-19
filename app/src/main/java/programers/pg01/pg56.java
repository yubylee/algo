package programers.pg01;

import java.util.Scanner;

// 대문자와 소문자
public class pg56 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String answer = "";
    String my_string = scan.nextLine();

    char[] arr = my_string.toCharArray();

    // a~z => 97~122
    // A~Z => 65~90

    String temp = "";

    for (int i = 0; i < arr.length; i++) {
      if(arr[i] >= 97 && arr[i] <= 122) {
        temp = arr[i] + "";
        answer += temp.toUpperCase();
      } else if(arr[i] >= 65 && arr[i] <= 90) {
        temp = arr[i] + "";
        answer += temp.toLowerCase();
      }
    }

    System.out.print(answer);
  }
}

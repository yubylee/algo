package programers.pg01;

import java.util.Scanner;

// 모음제거
public class pg45 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str = scan.nextLine();

    String arr[] = {"a", "e", "i", "o", "u"};

    String answer = "";
    for(int i = 0; i < arr.length; i++) {
      if(str.contains(arr[i])) {
        answer = str.replace(arr[i], "");
        str = answer;
      } else {
        answer = str;
      }
    }
    System.out.println(answer);
  }
}

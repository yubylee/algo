package programers.pg01;

import java.util.Scanner;

// 외계행성의 나이
public class pg30 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();
    String answer = "";

    String temp = Integer.toString(age);
    for(int i = 0; i < temp.length(); i++) {
      answer += (char) (temp.charAt(i) + 49);
    }

    System.out.println(answer);
  }
}

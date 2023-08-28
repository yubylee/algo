package programers.pg01;

import java.util.Scanner;

// 양꼬치
public class pg28 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int answer = 0;
    for(int i = 1; i <= n; i++) {
      if(i % 2 == 0) {
        answer += i;
      }
    }


    System.out.println(answer);
  }
}

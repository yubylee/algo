package programers.pg01;

import java.util.Scanner;

// 외계행성의 나이
public class pg32 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int answer = 0;
    for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        answer++;
      }
    }
    System.out.println(answer);
  }
}

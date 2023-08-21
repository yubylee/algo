package programers.pg01;

import java.util.Arrays;
import java.util.Scanner;
// 분모의 덧셈
public class pg7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();

    int numer = a*d + b*c;
    int denom = b*d;
    int max = 1;
    for (int i = 1; i <= numer && i <= denom; i++) {
      if(numer%i == 0 && denom%i ==0) {
        max = i;
      }
    }

    numer = numer/max;
    denom = denom/max;

    int[] arg = {numer, denom};
    System.out.println(Arrays.toString(arg));
  }
}

package backjoon_for;

import java.io.IOException;
import java.util.Scanner;

public class Bj03 {
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    scan.close();
    int result = 0;
    for(int i=1; i <= A; i++) {
      result += i;
    }
    System.out.println(result);

    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    int N = Integer.parseInt(br.readLine());
    //    br.close();
    //    int s = 0;
    //
    //    for(int i = 1; i <=N; i++) {
    //      s += i;
    //    }
    //    System.out.println(s);
  }
}

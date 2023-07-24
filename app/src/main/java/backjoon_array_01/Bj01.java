package backjoon_array_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj01 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int cnt = 0;
    int[] arr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int a = Integer.parseInt(br.readLine());

    for(int j = 0; j < arr.length; j++) {
      if(a == arr[j]) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}

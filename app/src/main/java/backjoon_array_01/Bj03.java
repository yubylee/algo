package backjoon_array_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj03 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);

    sb.append(arr[0]).append(" ").append(arr[N-1]);
    System.out.println(sb);
  }
}

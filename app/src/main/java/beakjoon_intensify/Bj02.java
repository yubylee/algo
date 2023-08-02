package beakjoon_intensify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj02 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int arr[] = new int[6];
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 2;
    arr[4] = 2;
    arr[5] = 8;

    StringTokenizer st = new StringTokenizer(br.readLine());
    int chat[] = new int[5];
    for(int i = 0; i < 5; i++) {
      chat[i] = Integer.parseInt(st.nextToken());
    }

    for(int j = 0; j < 5; j++) {
      sb.append(arr[j] - chat[j]).append(" ");
    }
    System.out.println(sb);
  }
}

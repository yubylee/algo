package backjoon_array_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj01p {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    double arr[] = new double[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(int i = 0; i < N; i++) {    
      arr[i] = Double.parseDouble(st.nextToken());
    }

    Arrays.sort(arr);
    double result = 0;
    for(int k = 0; k < N; k++) {
      result += arr[k] / arr[N-1] * 100;
    }

    System.out.println(result / N);
  }

}

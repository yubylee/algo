package app_12;

public class Main2 {
  public static void main(String[] args) {

    int n = 4;
    int arr[][] = new int[n][n];
    int num = 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[j][i] = num;
        num++;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%3d", arr[i][j]);
      }
      System.out.println();
    }

  }
}

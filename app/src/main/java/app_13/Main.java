package app_13;

public class Main {
  public static void main(String[] args) {

    int n = 4;
    int arr[][] = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = (i + 1) * (j + 1);
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

package app_10;

public class Main {
  public static void main(String[] args) {

    int n = 5;
    //int num = 1;
    for (int j = 0; j < n; j++) {

      for (int i = 0; i < n; i++) {
        System.out.printf("%3d", j*n + i + 1);
        //num++;
      }
      System.out.println();
    }

  }
}

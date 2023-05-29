package app_10;

public class Main2 {
  public static void main(String[] args) {

    int n = 5;
    int num = 1;
    for (int j =0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        System.out.printf("%3d", num);
        num++;
      }
      System.out.println();
    }

  }
}

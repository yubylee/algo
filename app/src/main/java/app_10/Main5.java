package app_10;

public class Main5 {
  public static void main(String[] args) {

    int n = 6;
    int num = 1;
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        System.out.printf("%4d",num);
        num++;
      }
      System.out.println();
    }

  }
}

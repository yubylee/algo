package app_14;

public class Main2 {
  public static void main(String[] args) {
    int n = 112938293;
    int arr[] = new int[10];

    for (int i = 1; i < 10; i++) {
      arr[n % 10]++;
      n /= 10;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(i + ": " + arr[i]);
    }
  }
}

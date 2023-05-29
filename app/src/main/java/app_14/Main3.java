package app_14;

public class Main3 {
  public static void main(String[] args) {

    int n = 123214294;
    int arr[] = new int[10];

    while (n > 0) {
      arr[n % 10]++;
      n /= 10;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(i + ": " + arr[i]);
    }

  }
}

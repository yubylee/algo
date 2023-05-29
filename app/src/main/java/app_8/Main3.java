package app_8;

public class Main3 {
  public static void main(String[] args) {

    int inputNum = 5;
    int accNum = 1;

    for (int i = 1; i <= inputNum; i++) {
      accNum *= i; // <- accNum = accNum * i
    }
    System.out.println(accNum);
    // 1 * 2 * 3 * 4 * 5
    System.out.println("-------");

    accNum = 1;
    for (int i = inputNum; i >= 1; i--) {
      accNum *= i;
    }
    System.out.println(accNum);
    // 5 * 4 * 3 * 2 * 1
  }
}

package app_8;

public class Main {
  public static void main(String[] args) {

    int inputNum = 7;
    int accNum = 1;
    for (int i = 1; i <= inputNum; i++) {
      accNum *= i;
    }
    System.out.println(accNum);
    System.out.println("--------------------");

    accNum = 1;
    for (int i = inputNum; i >= 1; i--) {
      accNum *= i;
    }
    System.out.println(accNum);
  }
}

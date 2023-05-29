package app_9;

public class Main3 {
  public static void main(String[] args) {

    int inputNum = 1231;
    int accSum = 0;
    // 1232 를 10 으로 나눳을때 나머지값 들의 합
    // 1232 => 2 => inputNum  = 123
    while (inputNum > 0) {
      accSum += inputNum % 10;
      inputNum /= 10;
    }
    System.out.println(accSum);
    System.out.println("-----");

    inputNum = 1212;
    accSum = 0;

    for (;inputNum > 0; inputNum /= 10) {
      accSum += inputNum % 10;
    }
    System.out.println(accSum);
  }
}

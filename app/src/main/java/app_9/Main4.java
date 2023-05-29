package app_9;

public class Main4 {
  public static void main(String[] args) {

    int inputNum = 123123;
    int accSum = 0;

    while(inputNum > 0) {
      accSum += inputNum% 10;
      inputNum /= 10;
    }
    System.out.println(accSum);
    System.out.println("------");

    for(;inputNum > 0;inputNum /= 10) {
      accSum += inputNum% 10;
    }
    System.out.println(accSum);
  }
}

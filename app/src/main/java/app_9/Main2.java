package app_9;

public class Main2 {
  public static void main(String[] args) {



    int inputNum = 1232;
    int accSum = 0;

    for (; inputNum > 0; inputNum /= 10) {
      accSum += inputNum % 10;
    }

    System.out.println(accSum);

    inputNum = 1232;
    accSum  = 0;
    while(inputNum > 0) {
      accSum += inputNum % 10;
      inputNum /= 10;
    }
    System.out.println(accSum);
  }
}

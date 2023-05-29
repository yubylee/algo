package app_7;

public class Main {
  public static void main(String[] args) {

    int num = 40;

    // 소수 1, 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 => 소수가 아님.
    // 소수 = 1과 자기자신만 나누어 떨어지는경우.

    boolean isPrimeNumber = true;

    for (int i = 2; i <= num/2; i++) {
      if(num % i ==0) {
        //primeNumber X
        isPrimeNumber = false;
      }
    }
    if (isPrimeNumber) {
      System.out.println(num + " 은 소수입니다.");
    } else {
      System.out.println(num + " 은 소수가 아닙니다.");
    }
  }
}

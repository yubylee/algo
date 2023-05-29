package app_7;

import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    boolean isPrimeNumber = true; 
    for (int i=2; i<=num/2; i++) {
      if(num % i == 0) {
        isPrimeNumber = false;
      }
    }
    if(isPrimeNumber) {
      System.out.println(num + "은 소수입니다.");
    } else {
      System.out.println(num + "은 소수가 아닙니다.");
    }
  }

}

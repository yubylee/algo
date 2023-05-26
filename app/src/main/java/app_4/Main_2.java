package app_4;

import java.util.Scanner;

public class Main_2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("숫자를 입력하세요.");
    int inputNum = scan.nextInt();
    int bin[] = new int[100];

    int i = 0;
    int mok = inputNum;

    while(mok > 0) {
      bin[i] = mok % 2;
      mok /= 2;
      i++;
    }
    i--;
    for(; i>=0; i--) {
      System.out.print(bin[i]);
    }
  } 
}

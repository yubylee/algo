package app_3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int []inputNum = new int[10];
    for (int i=0; i<10; i++) {
      inputNum[i] = scan.nextInt();
    }

    // 사용자 input
    // 1 2 2 3 1 4 2 2 4 3
    //1: 2
    //2: 4 --> 최빈수
    //3: 2
    //4: 2

    int []mode = new int[10];

    // index -> 출현한 수
    // index 값 -> index(출현한 수)가 몇번 나왔는지 저장하는 용도

    // "mode[3] = 5, => 3번숫자가, 5번 출현했따"

    //intputNum => 1 2 2 3 1 4 2 2 4 3 
    for (int i=0; i<10; i++) {
      mode[inputNum[i]]++;
      System.out.print(mode[inputNum[i]] + " ");
    }
    //mode[1] == 2
    //mode[2] == 4
    //mode[3] == 2
    //mode[4] == 2
    // 1 1 2 1 2 1 3 4 2 2
    System.out.println();

    int modeNum = 0; //최빈수
    int modeCnt = 0; // 최빈수가 나온 횟수

    for (int i=0; i<10; i++) {
      if (modeCnt < mode[i]) {
        modeCnt = mode[i];
        modeNum=i;

      }
      System.out.print(modeNum + " ");

      System.out.print(modeCnt + " ");

    }

    System.out.println("최빈수는: " + modeNum + " cnt: " + modeCnt);
  }
}

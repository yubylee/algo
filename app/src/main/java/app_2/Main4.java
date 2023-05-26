package app_2;

public class Main4 {
  public static void main(String[] args) {

    int arr[] = new int [100];
    arr[1] = 1;
    arr[2] = 1;

    for (int i=3; i<100; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    for (int i=1; i<=10; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    int preNum = 1;
    int prePreNum = 1;
    System.out.print(preNum + " ");
    System.out.print(prePreNum + " ");

    for(int i=3; i<=10; i++) {
      int nNum = preNum + prePreNum;
      System.out.print(nNum + " ");

      prePreNum = preNum;
      preNum = nNum;
    }
  }
}

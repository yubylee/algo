package app_2;

public class Main_2 {
  public static void main(String[] args) {

    int arr[] = new int[100];

    arr[1] = 1;
    arr[2] = 1;

    for(int i=3; i<100; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    for(int i=1; i<=10; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    int preNum = 1;
    int prevProNum = 1;

    System.out.print(preNum + " ");
    System.out.print(prevProNum + " ");

    for(int i=3; i<=10; i++) {
      int nNum = preNum+prevProNum;
      System.out.print(nNum + " ");

      prevProNum = preNum;
      preNum = nNum;
    }

  }
}

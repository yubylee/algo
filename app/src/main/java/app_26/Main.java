package app_26;

public class Main {
  public static void main(String[] args) {

    int a = 734;
    int b = 893;

    int arrA[] = new int [3];
    int arrB[] = new int [3];

    int lenA = 0;
    do {
      arrA[lenA] = a % 10;
      a /= 10;
      lenA++;
    } while (a > 0);

    int tranA = 0;
    int mux = 1;
    for(int i = arrA.length-1; i>=0; i--) {
      tranA += arrA[i]*mux;
      mux*=10;
    }
    System.out.println("tranA = " + tranA);


    int lenB = 0;
    do {
      arrB[lenB] = b % 10;
      b /= 10;
      lenB++;
    } while (b > 0);

    int tranB = 0;
    mux = 1;
    for(int i = arrB.length-1; i>=0; i--) {
      tranB += arrB[i]*mux;
      mux*=10;
    }
    System.out.println("tranB = " + tranB);


    if (tranA > tranB) {
      System.out.println(tranA);
    } else {
      System.out.println(tranB);
    }

  }
}

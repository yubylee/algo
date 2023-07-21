package java_practice;

public class Casting {
  public static void main(String[] args) {
    double a = 1.1;
    double b = 1;
    System.out.println(b);

    int c = (int)1.1;
    System.out.println(c);

    double b2 = 1;

    // 1 to String
    String strI = Integer.toString(1);
    System.out.println(strI.getClass());
  }
}

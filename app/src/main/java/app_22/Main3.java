package app_22;

public class Main3 {
  public static void main(String[] args) {

    String n = "12321";
    int len = n.length();
    boolean flg = true;
    for(int i = 0; i < len/2; i++) {
      if(n.charAt(i) != n.charAt(len -i -1)) {
        flg = false;
      }
    }
    System.out.println(flg);
  }
}

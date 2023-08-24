package programers.pg01;

import java.util.Scanner;

// 옷가게 할인받기
public class pg17 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int price = scan.nextInt();
    int result = 0;
    if(price >= 500000) {
      result = (int) (price - (price * 0.2));
    } else if(price >= 300000) {
      result = (int) (price - (price * 0.1));
    } else if(price >= 100000) {
      result = (int) (price - (price * 0.05));
    } else {
      result = price;
    }
    System.out.println(result);
  }

}

package programers.pg02;

// 마이 출력
public class pg18 {
  public int[] solution(int money) {
    int result[] = new int[2];
    result[0] = money / 5500;
    result[1] = money % 5500;
    return result;
  }
}

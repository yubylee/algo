package programers.pg02;

// 피자 나눠 먹기 (2)
public class pg14 {
  public int solution(int n) {
    int result = 1;

    while((6 * result) % n != 0) {
      result++;
    }

    return result;
  }
}

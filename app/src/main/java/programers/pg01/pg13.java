package programers.pg01;

// 피자 나눠먹기 (1)
public class pg13 {
  public int solution(int n) {
    int result = 0;
    if(n % 7 != 0) {
      result = n / 7 + 1;
    } else {
      result = n / 7;
    }
    return result;
  }
}

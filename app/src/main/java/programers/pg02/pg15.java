package programers.pg02;

// 피자 나눠 먹기 (3)
public class pg15 {
  public int solution(int slice, int n) {
    int answer = 0;
    if(n % slice != 0) {
      answer = n / slice + 1;
    } else {
      answer = n / slice;
    }
    return answer;
  }
}

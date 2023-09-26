package programers.pg02;

// 피자 나눠 먹기 (1)
public class pg13 {
  public int solution(int n) {
    int answer = 0;
    if(n % 7 != 0) {
      answer = n / 7 + 1;
    } else {
      answer = n / 7;
    }
    return answer;
  }
}

package programers.pg01;

// 구슬을 나누는 경우의 수
public class pg36 {

  public int combination(int n, int m) {
    if(m == 0 || n == m) {
      return 1;
    } else {
      return combination(n-1, m-1) + combination(n-1, m);
    }
  }
  public int solution(int balls, int share) {
    int answer = 0;
    answer = combination(balls, share);
    return answer;
  }
}

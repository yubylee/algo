package programers.pg01;

// 팩토리얼
public class pg44 {
  public int factorial(int n) {
    return (n <= 1) ? n : factorial(n - 1) * n;
  }
  public int solution(int n) {
    int answer = 0;
    for(int i = 1; i <= 10; i++) {
      if(factorial(i) <= n) {
        answer = i;
      }
    }
    return answer;
  }
}

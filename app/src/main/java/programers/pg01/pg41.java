package programers.pg01;

// 주사위의 개수
public class pg41 {
  public int solution(int[] box, int n) {
    int answer = 1;

    for(int i = 0; i < 3; i++) {
      answer *= box[i] / n;
    }
    return answer;
  }
}

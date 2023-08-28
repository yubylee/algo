package programers.pg01;

// 각도기
public class pg26 {
  public int solution(int angle) {
    int answer = 0;

    if(angle < 90 && angle > 0) {
      answer = 1;
    } else if(angle == 90) {
      answer = 2;
    } else if(angle > 90 && angle < 180) {
      answer = 3;
    } else {
      answer = 4;
    }

    return answer;
  }
}

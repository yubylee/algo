package programers.pg01;

// 짝수는 싫어요
public class pg12 {
  public int[] solution(int n) {
    int[] answer;
    int k = 0;

    if (n % 2 == 0) {
      answer = new int[n/2];
    } else {
      answer = new int[n/2 + 1];
    }

    for (int i = 1; i <= n; i++) {
      if(i % 2 == 1) {
        answer[k] = i;
        k++;
      }
    }

    return answer;
  }
}

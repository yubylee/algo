package programers.pg01;

// 약수 구하기
public class pg60 {
  public int[] solution(int n) {
    int[] answer;
    int count = 0;
    int j = 0;

    for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        count++;
      }
    }

    answer = new int[count];

    for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        answer[j] = i;
        j++;
      }
    }

    return answer;
  }
}

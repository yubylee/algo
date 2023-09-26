package programers.pg02;


// 분수의 덧셈
public class pg7 {
  public int[] solution(int num1, int dem1, int num2, int dem2) {
    int num = num1 * dem2 + num2 * dem1;
    int dem = dem1 * dem2;

    int max = 0;

    for (int i = 1; i <= num && i <= dem; i++) {
      if(num % i == 0 && dem % i == 0) {
        max = i;
      }
    }

    num = num / max;
    dem = dem / max;
    int[] answer = {num, dem};
    return answer;
  }
}

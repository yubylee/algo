package programers.pg02;

// 배열의 평균값
public class pg16 {
  public double solution(int[] numbers) {
    double answer = 0;
    double sum = 0;
    for(int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return answer = sum / numbers.length;
  }
}

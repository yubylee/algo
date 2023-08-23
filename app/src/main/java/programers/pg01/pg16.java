package programers.pg01;

// 배열의 평균값
public class pg16 {
  public double solution(int[] numbers) {
    double result = 0;
    double sum = 0;
    for(int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return result = sum / numbers.length;
  }
}

package programers.pg01;

// 배열 두 배로 만들기
public class pg8 {
  public int[] solution(int[] numbers) {
    int[] result = new int[numbers.length];
    for(int i = 0; i < numbers.length; i++) {
      result[i] = numbers[i] * 2;
    }
    return result;
  }
}

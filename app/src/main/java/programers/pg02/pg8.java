package programers.pg02;


// 배열 두 배 만들기
public class pg8 {
  public int[] solution(int[] numbers) {
    int answer[] = new int[numbers.length];
    for(int i = 0; i < numbers.length; i++) {
      answer[i] = numbers[i] * 2;
    }
    return answer;
  }
}

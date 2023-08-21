package programers.pg01;

import java.util.Arrays;

// 중간값 구하기
public class pg10 {
  public int solution(int[] array) {
    Arrays.sort(array);
    int answer = array[array.length / 2];
    return answer;
  }
}

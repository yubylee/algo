package programers.pg02;

import java.util.Arrays;

// 중앙값 구하기
public class pg10 {
  public int solution(int[] array) {
    Arrays.sort(array);
    return array[array.length / 2];
  }
}

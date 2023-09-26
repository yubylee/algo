package programers.pg02;

// 배열 뒤집기
public class pg20 {
  public int[] solution(int[] num_list) {
    int result[] = new int[num_list.length];
    int k = 1;
    for(int i = 0; i < num_list.length; i++) {
      result[num_list.length - i - 1] = num_list[i];
    }

    return result;
  }
}

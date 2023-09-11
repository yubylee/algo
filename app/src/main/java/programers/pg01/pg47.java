package programers.pg01;

// 숨어있는 숫자의 덧셈(1)
public class pg47 {
  public int solution(String my_string) {
    my_string = my_string.replaceAll("[a-zA-Z]", "");
    String[] arr = my_string.split("");

    int answer = 0;
    for(int i = 0; i < arr.length; i++) {
      answer += Integer.valueOf(arr[i]);
    }

    return answer;
  }
}

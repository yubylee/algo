package programers.pg01;

// 인덱스 바꾸기
public class pg58 {
  public String solution(String my_string, int num1, int num2) {
    String answer = "";
    char[] arr = my_string.toCharArray();

    arr[num1] = my_string.charAt(num2);
    arr[num2] = my_string.charAt(num1);

    answer = String.valueOf(arr);

    return answer;
  }
}
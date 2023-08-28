package programers.pg01;

// 특정 문자 제거하기
public class pg25 {
  public String solution(String my_string, String letter) {
    String answer = "";
    answer = my_string.replace(letter, "");
    return answer;
  }
}

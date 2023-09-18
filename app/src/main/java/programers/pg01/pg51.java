package programers.pg01;

// 중복된 문자 제거
public class pg51 {
  public String solution(String my_string) {
    String answer = "";

    for(int i = 0; i < my_string.length(); i++) {
      if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
        answer += my_string.charAt(i);
      }
    }
    return answer;
  }
}

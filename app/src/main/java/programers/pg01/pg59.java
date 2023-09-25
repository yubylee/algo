package programers.pg01;

import java.util.Arrays;

// 한 번만 등장한 문자
public class pg59 {
  public String solution(String s) {
    String answer = "";
    String arr[] = s.split("");
    int count = 0;

    Arrays.sort(arr);

    for(int i = 0; i < arr.length; i++) {
      count = 0;
      for(int j = 0; j < arr.length; j++) {
        if(arr[i].equals(arr[j])) {
          count++;
        }
      }
      if(count == 1) {
        answer += arr[i];
      }
    }

    return answer;
  }
}

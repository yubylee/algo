package programers.pg01;

import java.util.ArrayList;

// 소인수분해
public class pg48 {
  public ArrayList<Integer> solution(int n) {
    ArrayList<Integer> answer = new ArrayList<>();

    for(int i = 2; i <= n; i++) {
      while(n%i == 0) {
        if(!answer.contains(i))
          answer.add(i);
        n /= i;
      }
    }

    return answer;
  }
}

package programers.pg01;

// 컨트롤제트
public class pg49 {
  public int solution(String s) {
    String[] arr = s.split(" ");
    int answer = 0;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i].equals("Z")) {
        answer -= Integer.parseInt(arr[i-1]);
        continue;
      }
      answer += Integer.parseInt(arr[i]);
    }

    return answer;
  }
}

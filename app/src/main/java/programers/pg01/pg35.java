package programers.pg01;

// 가위 바위 보
public class pg35 {
  public String solution(String rsp) {
    String answer = "";

    for(int i = 0; i < rsp.length(); i++) {
      if(rsp.split("")[i].equals("5")) {
        answer += "2";
      } else if(rsp.split("")[i].equals("2")) {
        answer += "0";
      } else {
        answer += "5";
      }
    }
    return answer;
  }
}

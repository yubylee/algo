package app_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
  public static void main(String[] args) {

    Student stu1 = new Student("홍길동", 1918);
    Student stu2 = new Student("유관순", 2328);
    Student stu3 = new Student("윤봉길", 3839);

    ArrayList <Student>list = new ArrayList<Student>();

    list.add(stu1);
    list.add(stu2);
    list.add(stu3);

    for(Student stu : list) {
      System.out.println(stu.getName());
      System.out.println(stu.getNo());
    }

    Scanner scan = new Scanner(System.in);

    while(true) {
      System.out.println("학생검색 y, 종료 n");
      String input = scan.next();
      boolean flag = false;
      if(input.equals("y")) {
        System.out.println("이름쓰세요");
        String name = scan.next();
        for(Student stu : list) {
          if(stu.getName().equals(name)) {
            System.out.println("학생번호는 : " + stu.getNo());
            flag = true;
          }
        }
        if(!flag) {
          System.out.println("해당학생없음");
        }
      } else if(input.equals("n")) {
        break;
      }
    }
    System.out.println("종료되었습니다.");
  }
}

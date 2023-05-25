package app_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {

    Student stu1 = new Student("손오공", 1234);
    Student stu2 = new Student("저팔계", 2345);
    Student stu3 = new Student("사오정", 3456);

    ArrayList <Student>list = new ArrayList<Student>();

    list.add(stu1);
    list.add(stu2);
    list.add(stu3);

    for (Student stu : list) {
      System.out.println(stu.getName());
      System.out.println(stu.getNo());
    }

    Scanner scan = new Scanner(System.in);

    while(true) {
      System.out.println("계속 검색을하고 싶으면 y, 종료하고 싶으면 n");
      String input = scan.next();
      boolean flag = false;

      if(input.equals("y")) {
        System.out.println("검색을 시작합니다.");
        String name = scan.next();
        for(Student stu : list) {
          if(stu.getName().equals(name)) {
            System.out.println("학생의 학번은 : " + stu.getNo());
            flag = true;
          }
        }
        if(!flag) {
          System.out.println("학생이 없습니다.");
        }
      } else if(input.equals("n")) {
        break;
      }
    }
    System.out.println("프로그램이 종료되었습니다.");
  }
}

package app_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Maintest {
  public static void main(String[] args) {

    Student st1 = new Student("손오공", 1283);
    Student st2 = new Student("저팔계", 1323);
    Student st3 = new Student("사오정", 1232);

    ArrayList <Student>list = new ArrayList<>();
    list.add(st1);
    list.add(st2);
    list.add(st3);

    for (Student stu : list) {
      System.out.println(stu.getNo());
      System.out.println(stu.getName());
    }

    Scanner scan = new Scanner(System.in);

    while(true) {
      System.out.println("계속 검색을 하고 싶으면 y, 종료 n");
      String input = scan.next();

      if(input.equals("y")) {

        String name = scan.next();
        boolean flag = false;

        for(Student stu : list) {
          if(stu.getName().equals(name)) {
            System.out.println("학생학번은" + stu.getNo());
            flag = true;
          }
        }
        if(!flag) {
          System.out.println("없음");
        }
      } else if(input.equals("n")) {
        break;
      }
    }
    System.out.println("프로그램이 종료되었습니다.");
  }
}

package study.app.compare;

import study.app.array.ArrayList;
import study.app.linked.LinkedList;

public class Main {
  public static void main(String[] args) {
    ArrayList a = new ArrayList();
    a.addLast(10);
    a.addLast(20);
    a.addLast(30);
    ArrayList.ListIterator ai = a.listIterator();
    while((int)ai.next() == 20) {
      ai.add(25);
    }

    LinkedList l = new LinkedList();
    l.addLast(10);
    l.addLast(20);
    l.addLast(30);
    LinkedList.ListIterator li = l.listIterator();
    while((int)li.next() == 20) {
      li.add(25);
    }

  }
}

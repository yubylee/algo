package study.app.linked;

public class Main {
  public static void main(String[] args) {
    LinkedList numbers = new LinkedList();
    numbers.addLast(10);
    numbers.addLast(20);
    numbers.addLast(30);
    LinkedList.ListIterator i = numbers.listIterator();
    while(i.hasNext()) {
      if((int)i.next() == 20) {
        i.remove();
      }
    }
    System.out.println(numbers);
  }
}

package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo2 {
  public static void main(String[] args) {

    Collection<Integer> A = new HashSet<>();
    A.add(1);
    A.add(2);
    A.add(2);
    A.add(2);
    A.add(3);
    A.add(3);
    A.add(3);

    Iterator hi = A.iterator();
    while(hi.hasNext()) {
      System.out.print(hi.next());
    }
  }
}

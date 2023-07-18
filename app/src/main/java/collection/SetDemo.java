package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
  public static void main(String[] args) {
    HashSet<Integer> A = new HashSet<>();
    A.add(1);
    A.add(2);
    A.add(3);

    //    Iterator hi = A.iterator();
    //    while(hi.hasNext()) {
    //      System.out.println(hi.next());
    //    }

    HashSet<Integer> B = new HashSet<>();
    B.add(3);
    B.add(4);
    B.add(5);

    HashSet<Integer> C = new HashSet<>();
    C.add(1);
    C.add(2);

    //    System.out.println(A.containsAll(B));
    //    System.out.println(A.containsAll(C));

    //    A.addAll(B);
    //    A.retainAll(B);
    A.removeAll(B);

    Iterator hi = A.iterator();
    while(hi.hasNext()) {
      System.out.println(hi.next());
    }
  }
}

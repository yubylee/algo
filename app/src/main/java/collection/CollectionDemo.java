package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable {
  int serial;
  String owner;
  Computer(int serial, String owner) {
    this.serial = serial;
    this.owner = owner;
  }
  @Override
  public int compareTo(Object o) {
    return this.serial - ((Computer)o).serial;
  }

  @Override
  public String toString() {
    return serial+" "+owner;
  }
}

public class CollectionDemo {
  public static void main(String[] args) {
    List<Computer> computers = new ArrayList<>();
    computers.add(new Computer(500, "egoing"));
    computers.add(new Computer(200, "leezche"));
    computers.add(new Computer(3233, "graphittie"));
    Iterator i = computers.iterator();
    System.out.println("before");
    while(i.hasNext()) {
      System.out.println(i.next());
    }

    Collections.sort(computers);
    System.out.println("\nafter");
    i = computers.iterator();
    while(i.hasNext()) {
      System.out.println(i.next());
    }
  }
}

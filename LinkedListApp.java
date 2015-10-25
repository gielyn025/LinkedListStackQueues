
package activity.pkg2;

public class LinkedListApp {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertFirst(5);
    list.insertFirst(9);
    list.insertFirst(6);
    list.showSize();
    System.out.println();
    list.insertLast(3);
    list.insertLast(10);
    list.insertLast(4);
    list.showSize();
    System.out.println();
    list.displayBackward();
    list.displayForward();
    list.deleteFirst();
    list.deleteLast();
    list.deleteKey(1);
    list.displayForward();
    list.showSize();
    System.out.println();
    list.insertAfter(1, 5);
    list.insertAfter(1, 8);
    list.displayForward();
    list.showSize();
    System.out.println();
  }
}


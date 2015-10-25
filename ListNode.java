
package activity.pkg2;

public class ListNode {
  private int data;
  public ListNode next, previous;
  public ListNode(int data) {
  	this.data = data;
  }
  public int getData() {
  	return this.data;
  }
  public void showData() {
  	System.out.print(this.getData() + " ");
  }
}


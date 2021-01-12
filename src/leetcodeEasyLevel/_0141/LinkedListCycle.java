package leetcodeEasyLevel._0141;

public class LinkedListCycle {

  public static boolean hasCycle(ListNode head) {
    //엣지케이스
    if (head == null) {
      return false;
    }
    //slow는 한 칸씩 이동
    //fast는 두 칸씩 이동
    ListNode slow = head;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      // 포인터끼리 만나면 true
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }

}

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

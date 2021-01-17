package leetcodeEasyLevel;

public class _0160IntersectionofTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;

    while (a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
    return a;
  }
}

/*
class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}
 */
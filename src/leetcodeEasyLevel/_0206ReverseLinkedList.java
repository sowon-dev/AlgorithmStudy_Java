package leetcodeEasyLevel;

public class _0206ReverseLinkedList {

  public static ListNode reverseList(ListNode head) {
    // https://www.youtube.com/watch?v=jXArj8RBq0Q&feature=emb_logo
    if (head == null || head.next == null) {
      return head;
    }
    ListNode cur = head.next;
    head.next = null;
    while(cur != null){
      ListNode next = cur.next;
      cur.next = head;
      head = cur;
      cur = next;
    }
    return head;
  }

}

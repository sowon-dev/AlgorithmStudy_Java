package leetcodeEasyLevel;

public class _0234PalindromeLinkedList {
  protected ListNode reverse(ListNode head){
    if (head == null || head.next == null)
      return head;
    ListNode next = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return next;
  }
  public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;

    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
    }

    fast = head;
    slow = reverse(slow);

    while (fast != null && slow != null){
      if (fast.val != slow.val)
        return false;
      fast = fast.next;
      slow = slow.next;
    }
    return true;
  }
}

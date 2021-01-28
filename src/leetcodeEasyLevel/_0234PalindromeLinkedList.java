package leetcodeEasyLevel;

public class _0234PalindromeLinkedList {
  // Runtime 2 ms Memory 44.8 MB
  // 리스트가 팰린드롬이면 true를, 아니면 false를 리턴하는 문제이다.
  // 팰린드롬이란? https://sowon-dev.github.io/2021/01/09/210110replacevsreplaceall/
  // 1->2->2->1

  private ListNode reverse(ListNode head){
    ListNode preNode = null;
    while(head != null){
      ListNode nextNode = head.next;
      head.next = preNode;
      preNode = head;
      head = nextNode;
    }
    return preNode;
  }

  public boolean isPalindrome(ListNode head) {
    // ListNode에 null만 있어도 팰린드롬이다.
    if (head == null || head.next == null) return true;

    ListNode slow = head; // 1
    ListNode fast = head; // 1

    while(fast != null && fast.next != null) { // 1!=2 2!=2 null&&null => while종료
      slow = slow.next; //2 2
      fast = fast.next.next; //2 null
    }

    fast = head; // 1 2 2 null
    slow = reverse(slow); //역순으로 1 2 null

    while (fast != null && slow != null){
      if (fast.val != slow.val)
        return false;
      fast = fast.next;
      slow = slow.next;
    }
    return true;
  }
}

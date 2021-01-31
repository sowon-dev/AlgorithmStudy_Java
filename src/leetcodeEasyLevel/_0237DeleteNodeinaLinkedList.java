package leetcodeEasyLevel;

public class _0237DeleteNodeinaLinkedList {
  public void deleteNode(ListNode node) {
    //단순연결리스트에서 주어진 node를 삭제하고 출력하는 문제이다.
    // Runtime 0  Memory 40.4 MB
    node.val = node.next.val;
    node.next = node.next.next;
  }
}

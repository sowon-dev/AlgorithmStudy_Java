package leetcodeEasyLevel;

public class _0101SymmetricTree {
  // https://www.youtube.com/watch?v=3iIpnouY-bg&feature=emb_logo
  public static boolean isSymmetric(TreeNode root) {
    return isMirror(root, root);
  }

  static boolean isMirror(TreeNode node1,TreeNode node2) {
    if(node1==null && node2==null) return true;
    if(node1==null || node2==null) return false;
    if(node1.val != node2.val) return false;

    return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
  }

  public static void main(String[] args) {
    System.out.println(isSymmetric(new TreeNode()));
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "TreeNode{" +
        "val=" + val +
        ", left=" + left +
        ", right=" + right +
        '}';
  }
}